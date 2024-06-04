package Pages;

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
        windowMethods.switchSpecificTabWindow(1);
        windowMethods.closeCurrentWindow();
        windowMethods.switchSpecificTabWindow(0);
    }

    public void interactNewWindow(){
        elementMethods.clickElement(newWindowButton);
        windowMethods.switchSpecificTabWindow(1);
        windowMethods.closeCurrentWindow();
        windowMethods.switchSpecificTabWindow(0);
    }


}
