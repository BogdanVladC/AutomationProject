package Tests;

import HelperMethods.ElementMethods;
import SharedData.SharedData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeFormTest extends SharedData {

    @Test
    public void metodaTest() {
        ElementMethods elementMethods = new ElementMethods(getWebDriver());

        elementMethods.scrollElementByPixel(0,450);

        WebElement formsField = getWebDriver().findElement(By.xpath("//h5[text()='Forms']"));
        elementMethods.clickElement(formsField);

        elementMethods.scrollElementByPixel(0,450);

        WebElement webForms = getWebDriver().findElement(By.xpath("//span[text()='Practice Form']"));
        elementMethods.clickElement(webForms);

        WebElement firstNameField = getWebDriver().findElement(By.id("firstName"));
        String firstNameValue = "Bogdan";
        elementMethods.fillElement(firstNameField,firstNameValue);

        WebElement lastNameField = getWebDriver().findElement(By.cssSelector("input[placeholder='Last Name']"));
        String lastNameValue = "Vlad";
        elementMethods.fillElement(lastNameField,lastNameValue);

        WebElement userEmailField =getWebDriver().findElement(By.id("userEmail"));
        String userEmailValue = "Bogdan@gmail.com";
        elementMethods.fillElement(userEmailField,userEmailValue);

        WebElement userMobileNumberField = getWebDriver().findElement(By.cssSelector("input[placeholder='Mobile Number']"));
        String userMobileNumberValue = "0726311682";
        elementMethods.fillElement(userMobileNumberField,userMobileNumberValue);;

        String genderValue = "Female";
        genderField(genderValue);

        WebElement dateOfBirthField = getWebDriver().findElement(By.cssSelector(".react-datepicker__input-container"));
        elementMethods.clickElement(dateOfBirthField);

        WebElement monthDateOfBirth = getWebDriver().findElement(By.cssSelector(".react-datepicker__month-select"));
        String monthValue = "October";
        elementMethods.selectTextElement(monthDateOfBirth,monthValue);

        WebElement yearDateOfBirth = getWebDriver().findElement(By.cssSelector(".react-datepicker__year-select"));
        String yearValue = "1996";
        elementMethods.selectValueElement(yearDateOfBirth,yearValue);

        List<WebElement> dayDateOfBirthFields = getWebDriver().findElements
                (By.xpath("//div[not(contains(@class,'react-datepicker__day--outside-month')) and contains(@class,'react-datepicker__day react-datepicker__day')]"));
        String dayValue = "17";
        for (Integer i = 0; i < dayDateOfBirthFields.size(); i++){
            if (dayDateOfBirthFields.get(i).getText().equals(dayValue)){
                dayDateOfBirthFields.get(i).click();
                break;
            }
        }

        //facem un algoritm care sa selecteze valorile pe care i le specific

        List<String> Hobbies = Arrays.asList("Sports","Music");
        List<WebElement> hobbiesList = getWebDriver().findElements(By.xpath("//div[@id='hobbiesWrapper']//label[@class='custom-control-label']"));
        for (Integer index=0;index < hobbiesList.size(); index++ ){
            String currentElementText = hobbiesList.get(index).getText();
            if (Hobbies.contains(currentElementText)){
                elementMethods.clickElemForce(hobbiesList.get(index));
            }
        }

        //WebElement userHobbyField = webDriver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
        //userHobbyField.click();
        String subjectsValue = "Economics";
        WebElement subjectsField = getWebDriver().findElement(By.id("subjectsInput"));
        elementMethods.fillPressElement(subjectsField,subjectsValue,Keys.ENTER);

        WebElement pictureField = getWebDriver().findElement(By.id("uploadPicture"));
        String filePath = "src/test/resources/New Text Document.txt";
        elementMethods.fillElement(pictureField,new File(filePath).getAbsolutePath());

        WebElement addressField = getWebDriver().findElement(By.cssSelector("textarea[placeholder='Current Address']"));
        String addressFieldValue = "Salutare";
        elementMethods.fillElement(addressField,addressFieldValue);

        elementMethods.scrollElementByPixel(0,450);

        elementMethods.scrollElementByPixel(0,450);

        WebElement selectStateInput = getWebDriver().findElement(By.id("react-select-3-input"));
        String selectStateInputValue = "NCR";
        elementMethods.fillPressElement(selectStateInput,selectStateInputValue,Keys.ENTER);


        WebElement inputCityField=getWebDriver().findElement(By.id("react-select-4-input"));
        String inputCityFieldValue="Delhi";
        elementMethods.fillPressElement(inputCityField,inputCityFieldValue,Keys.ENTER);

        WebElement submitField= getWebDriver().findElement(By.id("submit"));
        elementMethods.clickElement(submitField);

        //validam tabelu cu valori

        List<WebElement> labelFields = getWebDriver().findElements(By.xpath("//table/tbody/tr/td[1]"));
        List<WebElement> valueFields = getWebDriver().findElements(By.xpath("//table/tbody/tr/td[2]"));

        Assert.assertEquals(labelFields.get(0).getText(),"Student Name");
        Assert.assertEquals(valueFields.get(0).getText(),firstNameValue+" "+lastNameValue);

        Assert.assertEquals(labelFields.get(1).getText(),"Student Email");
        Assert.assertEquals(valueFields.get(1).getText(),userEmailValue);

        Assert.assertEquals(labelFields.get(2).getText(),"Gender");
        Assert.assertEquals(valueFields.get(2).getText(),genderValue);

        Assert.assertEquals(labelFields.get(3).getText(),"Mobile");
        Assert.assertEquals(valueFields.get(3).getText(),userMobileNumberValue);

        Assert.assertEquals(labelFields.get(4).getText(),"Date of Birth");
        //Assert.assertEquals(valueFields.get(4).getText(),"22 May,2024");

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

    public void genderField(String gender) {
        if (gender == "Male") {
            WebElement userGenderField = getWebDriver().findElement(By.cssSelector("label[for='gender-radio-1']"));
            userGenderField.click();
        } else if (gender == "Female") {
            WebElement userGenderField = getWebDriver().findElement(By.cssSelector("label[for='gender-radio-2']"));
            userGenderField.click();
        } else {
            WebElement userGenderField = getWebDriver().findElement(By.cssSelector("label[for='gender-radio-3']"));
            userGenderField.click();
        }
    }
}
