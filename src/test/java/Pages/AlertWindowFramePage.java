package Pages;

import HelperMethods.ElementMethods;
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

    public void navigateToAlertPage(){
        elementMethods.scrollElementByPixel(0, 450);
        elementMethods.clickElement(alertWindowField);
    }

    public void navigateToFramesPage(){
        elementMethods.scrollElementByPixel(0, 450);
        elementMethods.clickElement(frameField);
    }
}
