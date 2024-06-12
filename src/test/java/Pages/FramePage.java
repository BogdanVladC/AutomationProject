package Pages;

import LoggerUtillity.LoggerUtillity;
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
        LoggerUtillity.infoTest("The user switches to specifie iFrame");

        elementMethods.printElementText(frameElement);
        LoggerUtillity.infoTest("The user interacts with the text of frameElement");

        frameMethods.switchParentFramer();
        LoggerUtillity.infoTest("The user switches to default iFrame");

        frameMethods.switchSpecificIframe("frame2");
        LoggerUtillity.infoTest("The user switches to specifie iFrame");

        elementMethods.printElementText(frameElement);
        LoggerUtillity.infoTest("The user interacts with the text of frameElement");
    }
}
