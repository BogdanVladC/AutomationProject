package Pages;

import ObjectData.WebTableObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablePage extends BasePage{
    public WebTablePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "addNewRecordButton")
    private WebElement addField;
    @FindBy(id = "firstName")
    private WebElement firstNameField;
    @FindBy(id ="lastName" )
    private WebElement lastNameField;
    @FindBy(id ="userEmail" )
    private WebElement userEmailField;
    @FindBy(id = "age")
    private WebElement userAgeField;
    @FindBy(id = "salary")
    private WebElement userSalaryField;
    @FindBy(id = "department")
    private WebElement userDepartmentField;
    @FindBy(id = "submit")
    private WebElement submitButton;
    @FindBy(id ="edit-record-4" )
    private WebElement editField;
    @FindBy(id = "delete-record-4")
    private  WebElement deleteButton;

    public void addNewEntry(WebTableObject webTableObject){
        elementMethods.clickElement(addField);
        elementMethods.fillElement(firstNameField,webTableObject.getFirstNameValue());
        elementMethods.fillElement(lastNameField,webTableObject.getLastNameValue());
        elementMethods.fillElement(userEmailField,webTableObject.getUserEmailValue());
        elementMethods.fillElement(userAgeField,webTableObject.getUserAgeValue());
        elementMethods.fillElement(userSalaryField,webTableObject.getUserSalaryValue());
        elementMethods.fillElement(userDepartmentField,webTableObject.getUserDepartmentValue());
        elementMethods.clickElement(submitButton);
    }

    public void editEntry(WebTableObject webTableObject) {
        elementMethods.clickElement(editField);
        elementMethods.refillElement(firstNameField, webTableObject.getFirstNameValue());
        elementMethods.refillElement(userAgeField, webTableObject.getUserAgeValue());
        elementMethods.clickElement(submitButton);
    }

    public void deleteEntry(){
      elementMethods.clickElemForce(deleteButton);
    }


}
