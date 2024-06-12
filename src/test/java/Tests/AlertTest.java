package Tests;

import HelperMethods.AlertMethods;
import HelperMethods.ElementMethods;
import Pages.AlertPage;
import Pages.AlertWindowFramePage;
import Pages.HomePage;
import SharedData.Hooks;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertTest extends SharedData.Hooks {

    @Test
    public void metodaTest() {
//        ElementMethods elementMethods = new ElementMethods(getWebDriver());
//        AlertMethods alertMethods = new AlertMethods(getWebDriver());

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertWindowFramePage alertWindowFramePage = new AlertWindowFramePage(getWebDriver());
        alertWindowFramePage.navigateToAlertPage();

        AlertPage alertPage = new AlertPage(getWebDriver());
        alertPage.dealWithAcceptAlert();
        alertPage.dealWithDelayAlert();
        alertPage.dealWithPromptButton("test");
        alertPage.dealWithCancelButton();


    }

}
