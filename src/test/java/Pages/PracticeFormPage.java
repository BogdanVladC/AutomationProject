package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;


import javax.annotation.Nonnull;
import java.io.File;
import java.util.Arrays;
import java.util.List;

public class PracticeFormPage extends BasePage{
    public PracticeFormPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id ="firstName")
    private WebElement firstNameField;
    @FindBy(css = "input[placeholder='Last Name']")
    private WebElement lastNameField;
    @FindBy(id ="userEmail")
    private WebElement userEmailField;
    @FindBy(css = "input[placeholder='Mobile Number']")
    private WebElement userMobileNumberField;
    @FindBy(css = ".react-datepicker__input-container")
    private WebElement dateOfBirthField;
    @FindBy(css = ".react-datepicker__month-select")
    private WebElement monthDateOfBirth;
    @FindBy(css = ".react-datepicker__year-select")
    private WebElement yearDateOfBirth;
    @FindBy(xpath = "//div[not(contains(@class,'react-datepicker__day--outside-month')) and contains(@class,'react-datepicker__day react-datepicker__day')]")
    private List<WebElement> dayDateOfBirthFields;
    @FindBy(css ="label[for='gender-radio-1']" )
    private WebElement userGenderFieldMale;
    @FindBy(css ="label[for='gender-radio-2']")
    private WebElement userGenderFieldFemale;
    @FindBy(css="label[for='gender-radio-3']")
    private WebElement userGenderFieldOther;
    @FindBy(xpath = "//div[@id='hobbiesWrapper']//label[@class='custom-control-label']")
    private List<WebElement> hobbiesList;
    @FindBy(id = "subjectsInput")
    private WebElement subjectsField;
    @FindBy(id = "uploadPicture")
    private WebElement pictureField;
    @FindBy(css ="textarea[placeholder='Current Address']")
    private WebElement addressField;
    @FindBy(id="react-select-3-input")
    private WebElement selectStateInput;
    @FindBy(id="react-select-4-input")
    private WebElement inputCityField;
    @FindBy(id ="submit")
    private WebElement submitField;
    @FindBy(xpath = "//table/tbody/tr/td[1]")
    private List<WebElement>labelFields;
    @FindBy(xpath = "//table/tbody/tr/td[2]")
    private List<WebElement>valueFields;

    public void fillFirstName(String firstNameValue){
        elementMethods.fillElement(firstNameField,firstNameValue);
        elementMethods.scrollElementByPixel(0,450);
    }
    public void fillLastName(String lastNameValue){
        elementMethods.fillElement(lastNameField,lastNameValue);
    }
    public void fillEmail(String userEmailValue){
        elementMethods.fillElement(userEmailField,userEmailValue);
    }
    public void fillMobileNo(String userMobileNumberValue){
        elementMethods.fillElement(userMobileNumberField,userMobileNumberValue);;
    }
    public void fillDateOfBirthField(String monthValue, String yearValue, String dayValue){
        elementMethods.clickElement(dateOfBirthField);
        elementMethods.selectTextElement(monthDateOfBirth,monthValue);
        elementMethods.selectValueElement(yearDateOfBirth,yearValue);
        for (Integer i = 0; i < dayDateOfBirthFields.size(); i++){
            if (dayDateOfBirthFields.get(i).getText().equals(dayValue)){
                dayDateOfBirthFields.get(i).click();
                break;
            }
        }

    }
    public void fillGender(String gender){
        if (gender == "Male") {
            elementMethods.clickElement(userGenderFieldMale);
        } else if (gender == "Female") {
            elementMethods.clickElement(userGenderFieldFemale);
        } else {
            elementMethods.clickElement(userGenderFieldOther);
        }
    }
    public void fillHobbies( List<String> Hobbies){
        for (Integer index=0;index < hobbiesList.size(); index++ ){
            String currentElementText = hobbiesList.get(index).getText();
            if (Hobbies.contains(currentElementText)){
                elementMethods.clickElemForce(hobbiesList.get(index));
            }
        }
    }
    public void fillSubjects( String subjectsValue ){
        elementMethods.fillPressElement(subjectsField,subjectsValue, Keys.ENTER);
    }
    public void uploadPicture (String filePath){
        elementMethods.fillElement(pictureField,new File(filePath).getAbsolutePath());
    }
    public void fillAddress(String addressFieldValue){
        elementMethods.fillElement(addressField,addressFieldValue);
    }
    public void fillState(String selectStateInputValue){
        //elementMethods.clickElemForce(selectStateInput);
        elementMethods.fillPressElement(selectStateInput,selectStateInputValue,Keys.ENTER);
    }
    public void fillCity(String inputCityFieldValue){
        elementMethods.fillPressElement(inputCityField,inputCityFieldValue,Keys.ENTER);
    }

    public void clickSubmit(){
      elementMethods.clickElemForce(submitField);
    }
    public void validatePracticeFormTable(String firstNameValue, String lastNameValue, String userEmailValue, String genderValue, String userMobileNumberValue,
                                          String subjectsValue, List<String> Hobbies, String filePath, String addressFieldValue, String selectStateInputValue, String inputCityFieldValue){
        Assert.assertEquals(labelFields.get(0).getText(),"Student Name");
        Assert.assertEquals(valueFields.get(0).getText(),firstNameValue+" "+lastNameValue);

        Assert.assertEquals(labelFields.get(1).getText(),"Student Email");
        Assert.assertEquals(valueFields.get(1).getText(),userEmailValue);

        Assert.assertEquals(labelFields.get(2).getText(),"Gender");
        Assert.assertEquals(valueFields.get(2).getText(),genderValue);

        Assert.assertEquals(labelFields.get(3).getText(),"Mobile");
        Assert.assertEquals(valueFields.get(3).getText(),userMobileNumberValue);

        Assert.assertEquals(labelFields.get(4).getText(),"Date of Birth");
        Assert.assertEquals(valueFields.get(4).getText(),"17 October,1996");

        Assert.assertEquals(labelFields.get(5).getText(),"Subjects");
        Assert.assertEquals(valueFields.get(5).getText(),subjectsValue);

        Assert.assertEquals(labelFields.get(6).getText(),"Hobbies");
        for (Integer index=0; index< Hobbies.size(); index++) {

            Assert.assertTrue(valueFields.get(6).getText().contains(Hobbies.get(index)));
        }

        Assert.assertEquals(labelFields.get(7).getText(),"Picture");
        String[] arrayFile = filePath.split("/");
        Integer indexNecesar = arrayFile.length - 1;
        Assert.assertEquals(valueFields.get(7).getText(),arrayFile[indexNecesar]);

        Assert.assertEquals(labelFields.get(8).getText(),"Address");
        Assert.assertEquals(valueFields.get(8).getText(),addressFieldValue);

        Assert.assertEquals(labelFields.get(9).getText(),"State and City");
        Assert.assertEquals(valueFields.get(9).getText(),selectStateInputValue+" "+inputCityFieldValue);
    }






}
