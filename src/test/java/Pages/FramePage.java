package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramePage extends BasePage {

    public FramePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "sampleHeading")
    private WebElement frameElement;

    public void dealWithIframe(){
        frameMethods.switchSpecificIframe("frame1");
        elementMethods.printElementText(frameElement);
        frameMethods.switchParentFramer();
        frameMethods.switchSpecificIframe("frame2");
        elementMethods.printElementText(frameElement);
    }
}
