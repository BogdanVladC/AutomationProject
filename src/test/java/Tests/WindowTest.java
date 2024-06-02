package Tests;

import HelperMethods.ElementMethods;
import HelperMethods.WindowMethods;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WindowTest extends SharedData {

    @Test
    public void metodaTest(){
        ElementMethods elementMethods = new ElementMethods(getWebDriver());
        WindowMethods windowMethods = new WindowMethods(getWebDriver());

        elementMethods.scrollElementByPixel(0,450);

        WebElement windowField = getWebDriver().findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        elementMethods.clickElement(windowField);

        elementMethods.scrollElementByPixel(0,450);

        WebElement browserWindowField = getWebDriver().findElement(By.xpath("//span[text()='Browser Windows']"));
        elementMethods.clickElement(browserWindowField);

        WebElement newTabButton = getWebDriver().findElement(By.id("tabButton"));
        elementMethods.clickElement(newTabButton);

        //trebuie sa indentificam nr de taburi deschise
        windowMethods.switchSpecificTabWindow(1);
        //ca sa inchidem tab curent se inchide cu close
        // broserul se inchide cu quit
        windowMethods.closeCurrentWindow();
        windowMethods.switchSpecificTabWindow(0);

        WebElement newWindowButton = getWebDriver().findElement(By.id("windowButton"));
        elementMethods.clickElement(newWindowButton);
        windowMethods.switchSpecificTabWindow(1);
        windowMethods.closeCurrentWindow();
        windowMethods.switchSpecificTabWindow(0);

    }
}
