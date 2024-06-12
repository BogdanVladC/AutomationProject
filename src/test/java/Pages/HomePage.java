package Pages;

import HelperMethods.ElementMethods;
import LoggerUtillity.LoggerUtillity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    private WebElement alertField;
    @FindBy(xpath = "//h5[text()='Forms']")
    private  WebElement formsField;
    @FindBy(xpath = "//h5[text()='Elements']")
    private WebElement elementsField;




    public void navigateToAlertFrameWindowPage(){
        elementMethods.scrollElementByPixel(0, 450);
        LoggerUtillity.infoTest("The user scroll down the page");
        elementMethods.clickElemForce(alertField);
        LoggerUtillity.infoTest("The user clicks the alertField element");

    }
    public void navigateToFormsPage(){
        elementMethods.scrollElementByPixel(0, 450);
        LoggerUtillity.infoTest("The user scroll down the page");
        elementMethods.clickElement(formsField);
        LoggerUtillity.infoTest("The user clicks the formsField element");
    }
    public void navigateToElementsPage(){
        elementMethods.scrollElementByPixel(0,450);
        LoggerUtillity.infoTest("The user scroll down the page");
        elementMethods.clickElement(elementsField);
        LoggerUtillity.infoTest("The user clicks the elementsField element");
    }
}
