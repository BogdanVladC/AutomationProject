package Tests;

import Pages.AlertWindowFramePage;
import Pages.BrowserWindowPage;
import Pages.HomePage;
import SharedData.Hooks;
import org.testng.annotations.Test;

public class WindowTest extends Hooks {

    @Test
    public void metodaTest(){
        HomePage  homePage = new HomePage(getWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertWindowFramePage alertWindowFramePage = new AlertWindowFramePage(getWebDriver());
        alertWindowFramePage.navigateToBrowserWindowPage();

        BrowserWindowPage browserWindowPage = new BrowserWindowPage(getWebDriver());
        browserWindowPage.interactWithNewTabButton();
        browserWindowPage.interactNewWindow();


    }
}
