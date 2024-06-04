package Tests;

import HelperMethods.ElementMethods;
import HelperMethods.WindowMethods;
import Pages.AlertWindowFramePage;
import Pages.BrowserWindowPage;
import Pages.HomePage;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WindowTest extends SharedData {

    @Test
    public void metodaTest(){
        HomePage  homePage = new HomePage(getWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertWindowFramePage alertWindowFramePage = new AlertWindowFramePage(getWebDriver());
        alertWindowFramePage.navigateToBrowserWindowPage();

        BrowserWindowPage browserWindowPage = new BrowserWindowPage(getWebDriver());
        browserWindowPage.interactNewWindow();
        browserWindowPage.interactNewWindow();


    }
}
