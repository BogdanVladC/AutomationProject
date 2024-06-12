package Pages;

import HelperMethods.ElementMethods;
import LoggerUtillity.LoggerUtillity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertWindowFramePage extends BasePage {
    public AlertWindowFramePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//span[text()='Alerts']")
    private WebElement alertWindowField;
    @FindBy(xpath = "//span[text()='Frames']")
    private   WebElement frameField;
    @FindBy(xpath = "//span[text()='Browser Windows']")
    private WebElement browserWindowField;

    public void navigateToAlertPage(){
        elementMethods.scrollElementByPixel(0, 450);
        LoggerUtillity.infoTest("The user scroll down the page");
        elementMethods.clickElement(alertWindowField);
        LoggerUtillity.infoTest("The user clicks the alertWindowField element");

    }

    public void navigateToFramesPage(){
        elementMethods.scrollElementByPixel(0, 450);
        LoggerUtillity.infoTest("The user scroll down the page");
        elementMethods.clickElement(frameField);
        LoggerUtillity.infoTest("The user clicks the frameField element");
    }

    public void navigateToBrowserWindowPage(){
        elementMethods.scrollElementByPixel(0, 450);
        LoggerUtillity.infoTest("The user scroll down the page");
        elementMethods.clickElement(browserWindowField);
        LoggerUtillity.infoTest("The user clicks the browserWindowField element");
    }
}
