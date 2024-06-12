package Pages;

import LoggerUtillity.LoggerUtillity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrowserWindowPage extends HomePage{
    public BrowserWindowPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "tabButton")
    WebElement newTabButton;
    @FindBy(id ="windowButton" )
    WebElement newWindowButton;

    public void interactWithNewTabButton(){
        elementMethods.clickElement(newTabButton);
        LoggerUtillity.infoTest("The user clicks on new tab button");

        windowMethods.switchSpecificTabWindow(1);
        LoggerUtillity.infoTest("The user switches to tab with index 1");

        windowMethods.closeCurrentWindow();
        LoggerUtillity.infoTest("The user closes the current tab");

        windowMethods.switchSpecificTabWindow(0);
        LoggerUtillity.infoTest("The user switches to tab with index 0");
    }

    public void interactNewWindow(){
        elementMethods.clickElement(newWindowButton);
        LoggerUtillity.infoTest("The user clicks on new window button");

        windowMethods.switchSpecificTabWindow(1);
        LoggerUtillity.infoTest("The user switchs to tab with index 1");

        windowMethods.closeCurrentWindow();
        LoggerUtillity.infoTest("The user closes the current windows");

        windowMethods.switchSpecificTabWindow(0);
        LoggerUtillity.infoTest("The user switches to tab with index 0");
    }


}
