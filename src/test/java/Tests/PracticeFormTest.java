package Tests;

import HelperMethods.ElementMethods;
import Pages.FormsPage;
import Pages.HomePage;
import Pages.PracticeFormPage;
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
        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToFormsPage();

        FormsPage formsPage = new FormsPage(getWebDriver());
        formsPage.navigateToPracticeForm();
        String firstNameValue = "Bogdan";
        String lastNameValue = "Vlad";
        String userEmailValue = "Bogdan@gmail.com";
        String userMobileNumberValue = "0726311682";
        String monthValue = "October";
        String yearValue = "1996";
        String dayValue = "17";
        List<String> Hobbies = Arrays.asList("Sports","Music");
        String addressFieldValue = "Salutare";
        String genderValue = "Female";
        String subjectsValue = "Economics";
        String filePath = "src/test/resources/New Text Document.txt";

        PracticeFormPage practiceFormPage = new PracticeFormPage(getWebDriver());
        practiceFormPage.fillFirstName(firstNameValue);
        practiceFormPage.fillLastName(lastNameValue);
        practiceFormPage.fillEmail(userEmailValue);
        practiceFormPage.fillMobileNo(userMobileNumberValue);
        practiceFormPage.fillDateOfBirthField(monthValue,yearValue,dayValue);
        practiceFormPage.fillGender(genderValue);
        practiceFormPage.fillSubjects(subjectsValue);
        practiceFormPage.uploadPicture(filePath);
        practiceFormPage.fillAddress(addressFieldValue);
        practiceFormPage.fillHobbies(Hobbies);


//        WebElement selectStateInput = getWebDriver().findElement(By.id("react-select-3-input"));
//        String selectStateInputValue = "NCR";
//        elementMethods.fillPressElement(selectStateInput,selectStateInputValue,Keys.ENTER);
//
//
//        WebElement inputCityField=getWebDriver().findElement(By.id("react-select-4-input"));
//        String inputCityFieldValue="Delhi";
//        elementMethods.fillPressElement(inputCityField,inputCityFieldValue,Keys.ENTER);
//
//        WebElement submitField= getWebDriver().findElement(By.id("submit"));
//        elementMethods.clickElement(submitField);
//
//        //validam tabelu cu valori
//
//        List<WebElement> labelFields = getWebDriver().findElements(By.xpath("//table/tbody/tr/td[1]"));
//        List<WebElement> valueFields = getWebDriver().findElements(By.xpath("//table/tbody/tr/td[2]"));
//
//        Assert.assertEquals(labelFields.get(0).getText(),"Student Name");
//        Assert.assertEquals(valueFields.get(0).getText(),firstNameValue+" "+lastNameValue);
//
//        Assert.assertEquals(labelFields.get(1).getText(),"Student Email");
//        Assert.assertEquals(valueFields.get(1).getText(),userEmailValue);
//
//        Assert.assertEquals(labelFields.get(2).getText(),"Gender");
//        Assert.assertEquals(valueFields.get(2).getText(),genderValue);
//
//        Assert.assertEquals(labelFields.get(3).getText(),"Mobile");
//        Assert.assertEquals(valueFields.get(3).getText(),userMobileNumberValue);
//
//        Assert.assertEquals(labelFields.get(4).getText(),"Date of Birth");
//        //Assert.assertEquals(valueFields.get(4).getText(),"22 May,2024");
//
//        Assert.assertEquals(labelFields.get(5).getText(),"Subjects");
//        Assert.assertEquals(valueFields.get(5).getText(),subjectsValue);
//
//        Assert.assertEquals(labelFields.get(6).getText(),"Hobbies");
//        for (Integer index=0; index< Hobbies.size(); index++) {
//
//            Assert.assertTrue(valueFields.get(6).getText().contains(Hobbies.get(index)));
//        }
//
//        Assert.assertEquals(labelFields.get(7).getText(),"Picture");
//        String[] arrayFile = filePath.split("/");
//        Integer indexNecesar = arrayFile.length - 1;
//        Assert.assertEquals(valueFields.get(7).getText(),arrayFile[indexNecesar]);
//
//        Assert.assertEquals(labelFields.get(8).getText(),"Address");
//        Assert.assertEquals(valueFields.get(8).getText(),addressFieldValue);
//
//        Assert.assertEquals(labelFields.get(9).getText(),"State and City");
//        Assert.assertEquals(valueFields.get(9).getText(),selectStateInputValue+" "+inputCityFieldValue);
    }

}
