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
        String selectStateInputValue = "NCR";
        String inputCityFieldValue="Delhi";

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
        practiceFormPage.fillState(selectStateInputValue);
        practiceFormPage.fillCity(inputCityFieldValue);
        practiceFormPage.clickSubmit();
        practiceFormPage.validatePracticeFormTable(firstNameValue,lastNameValue,userEmailValue,genderValue,userMobileNumberValue,
                subjectsValue,Hobbies,filePath,addressFieldValue,selectStateInputValue,inputCityFieldValue);

    }

}
