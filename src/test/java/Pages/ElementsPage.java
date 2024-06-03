package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage extends BasePage{
    public ElementsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//span[text()='Web Tables']")
    private WebElement webTablesField;

    public void navigateToWebTablesPage(){
        elementMethods.scrollElementByPixel(0,450);
        elementMethods.clickElement(webTablesField);
    }

}
