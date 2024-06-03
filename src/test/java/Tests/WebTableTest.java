package Tests;

import HelperMethods.ElementMethods;
import Pages.ElementsPage;
import Pages.HomePage;
import Pages.WebTablePage;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTest extends SharedData {

    @Test
    public void metodaTest(){

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToElementsPage();

        ElementsPage elementsPage = new ElementsPage(getWebDriver());
        elementsPage.navigateToWebTablesPage();

        String firstNameValue = "Bogdan";
        String lastNameValue = "Cristea";
        String userEmailValue = "cristea.bogdan@gmail.com";
        String userAgeValue = "25";
        String userSalaryValue = "2500";
        String userDepartmentValue = "QMM";
        String userAgeModifyValue = "29";
        String firstNameModifyValue = "Vlad";
        WebTablePage webTablePage =new WebTablePage(getWebDriver());
        webTablePage.addNewEntry(firstNameValue,lastNameValue,userEmailValue,userAgeValue,userSalaryValue,userDepartmentValue);
        webTablePage.editEntry(firstNameModifyValue,userAgeModifyValue);
        webTablePage.deleteEntry();
    }
}

