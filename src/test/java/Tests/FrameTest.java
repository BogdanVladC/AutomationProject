package Tests;

import HelperMethods.ElementMethods;
import HelperMethods.FrameMethods;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameTest extends SharedData {

    @Test
    public void metodaTest() {
        ElementMethods elementMethods = new ElementMethods(getWebDriver());
        FrameMethods frameMethods = new FrameMethods(getWebDriver());


        elementMethods.scrollElementByPixel(0,450);

        WebElement windowField = getWebDriver().findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        elementMethods.clickElement(windowField);

        elementMethods.scrollElementByPixel(0,450);

        WebElement frameField = getWebDriver().findElement(By.xpath("//span[text()='Frames']"));
        elementMethods.clickElement(frameField);

        //interactionam cu un iFrame
        frameMethods.switchSpecificIframe("frame1");
        WebElement frame1Element = getWebDriver().findElement(By.id("sampleHeading"));
        elementMethods.printElementText(frame1Element);

        // specificam sa revina la frameul curent
        frameMethods.switchParentFramer();
        frameMethods.switchSpecificIframe("frame2");
        WebElement frame2Element = getWebDriver().findElement(By.id("sampleHeading"));
        elementMethods.printElementText(frame2Element);

    }
}
