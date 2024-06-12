package Pages;

import LoggerUtillity.LoggerUtillity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage {
    public AlertPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(id = "alertButton")
    private WebElement alertOk;
    @FindBy(id ="timerAlertButton")
    private  WebElement timerAlert;
    @FindBy(id ="promtButton")
    private WebElement prompAlert;
    @FindBy(id = "promptResult")
    private WebElement promptAlertValue;
    @FindBy(id ="confirmButton")
    private WebElement boxAlert;
    @FindBy(id ="confirmResult")
    private WebElement boxAlertValue;

    public void dealWithAcceptAlert(){
        elementMethods.clickElement(alertOk);
        LoggerUtillity.infoTest("The user clicks the alertOk element");

        alertMethods.acceptAlert();
        LoggerUtillity.infoTest("The user clicks accept on the alert");
    }

    public void dealWithDelayAlert(){
        elementMethods.clickElement(timerAlert);
        LoggerUtillity.infoTest("The user clicks the timerAlert element");

        alertMethods.waitForAlert();
        LoggerUtillity.infoTest("The user waits for the alert to pop-up");

        alertMethods.acceptAlert();
        LoggerUtillity.infoTest("The user clicks accept on the alert");
    }

    public void dealWithPromptButton(String text){
        elementMethods.clickElement(prompAlert);
        LoggerUtillity.infoTest("The user clicks the prompAlert element");
        alertMethods.fillAlert(text);
        LoggerUtillity.infoTest("The fills the alert with the following text: "+text);
        elementMethods.validateElementText(promptAlertValue,"You entered "+text);
        LoggerUtillity.infoTest("The user validates the text element");

    }

    public void dealWithCancelButton(){
        elementMethods.clickElement(boxAlert);
        LoggerUtillity.infoTest("The user clicks the boxAlert element");
        alertMethods.cancelAlert();
        LoggerUtillity.infoTest("The user clicks cancel alert");
        elementMethods.validateElementText(boxAlertValue,"You selected Cancel");
        LoggerUtillity.infoTest("The user validates the cancel element");
    }


}
