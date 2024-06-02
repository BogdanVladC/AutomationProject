package Pages;

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
        alertMethods.acceptAlert();
    }

    public void dealWithDelayAlert(){
        elementMethods.clickElement(timerAlert);
        alertMethods.waitForAlert();
        alertMethods.acceptAlert();
    }

    public void dealWithPromptButton(String text){
        elementMethods.clickElement(prompAlert);
        alertMethods.fillAlert(text);
        elementMethods.validateElementText(promptAlertValue,"You entered "+text);

    }

    public void dealWithCancelButton(){
        elementMethods.clickElement(boxAlert);
        alertMethods.cancelAlert();
        elementMethods.validateElementText(boxAlertValue,"You selected Cancel");
    }


}
