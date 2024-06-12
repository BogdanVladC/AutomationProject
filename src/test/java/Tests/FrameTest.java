package Tests;

import Pages.AlertWindowFramePage;
import Pages.FramePage;
import Pages.HomePage;
import SharedData.Hooks;
import org.testng.annotations.Test;

public class FrameTest extends Hooks {

    @Test
    public void metodaTest() {

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertWindowFramePage alertWindowFramePage = new AlertWindowFramePage(getWebDriver());
        alertWindowFramePage.navigateToFramesPage();

        FramePage framePage = new FramePage(getWebDriver());
        framePage.dealWithIframe();

    }
}
