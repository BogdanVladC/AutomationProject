package Pages;

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

    public void addNewEntry(String firstNameValue,String lastNameValue,String userEmailValue,String userAgeValue,String userSalaryValue,String userDepartmentValue ){
        elementMethods.clickElement(addField);
        elementMethods.fillElement(firstNameField,firstNameValue);
        elementMethods.fillElement(lastNameField,lastNameValue);
        elementMethods.fillElement(userEmailField,userEmailValue);
        elementMethods.fillElement(userAgeField,userAgeValue);
        elementMethods.fillElement(userSalaryField,userSalaryValue);
        elementMethods.fillElement(userDepartmentField,userDepartmentValue);
        elementMethods.clickElement(submitButton);
    }

    public void editEntry(String firsNameValue,String userAgeValue) {
        elementMethods.clickElement(editField);
        elementMethods.refillElement(firstNameField, firsNameValue);
        elementMethods.refillElement(userAgeField, userAgeValue);
        elementMethods.clickElement(submitButton);
    }

    public void deleteEntry(){
      elementMethods.clickElement(deleteButton);
    }


}
