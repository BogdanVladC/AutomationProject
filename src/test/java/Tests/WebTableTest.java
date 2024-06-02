package Tests;

import HelperMethods.ElementMethods;
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
        ElementMethods elementMethods = new ElementMethods(getWebDriver());

        //facem un scrooll in pagina
        elementMethods.scrollElementByPixel(0,450);




        WebElement elementsField =getWebDriver().findElement(By.xpath("//h5[text()='Elements']"));
        elementMethods.clickElement(elementsField);

        elementMethods.scrollElementByPixel(0,450);

        WebElement webTablesField = getWebDriver().findElement(By.xpath("//span[text()='Web Tables']"));
        elementMethods.clickElement(webTablesField);

        WebElement addField = getWebDriver().findElement(By.id("addNewRecordButton"));
        elementMethods.clickElement(addField);

        WebElement firstNameField = getWebDriver().findElement(By.id("firstName"));
        String firstNameValue = "Bogdan";
        elementMethods.fillElement(firstNameField,firstNameValue);


        WebElement lastNameField = getWebDriver().findElement(By.id("lastName"));
        String lastNameValue = "Cristea";
        elementMethods.fillElement(lastNameField,lastNameValue);

        WebElement userEmailField = getWebDriver().findElement(By.id("userEmail"));
        String userEmailValue = "cristea.bogdan@gmail.com";
        elementMethods.fillElement(userEmailField,userEmailValue);

        WebElement userAgeField = getWebDriver().findElement(By.id("age"));
        String userAgeValue = "25";
        elementMethods.fillElement(userAgeField,userAgeValue);

        WebElement userSalaryField = getWebDriver().findElement(By.id("salary"));
        String userSalaryValue = "2500";
        elementMethods.fillElement(userSalaryField,userSalaryValue);

        WebElement userDepartmentField = getWebDriver().findElement(By.id("department"));
        String userDepartmentValue = "QMM";
        elementMethods.fillElement(userDepartmentField,userDepartmentValue);

        WebElement submitButton = getWebDriver().findElement(By.id("submit"));
        elementMethods.clickElement(submitButton);

        //modificam entry-ul adaugat mai sus

        WebElement editField = getWebDriver().findElement(By.id("edit-record-4"));
        elementMethods.clickElement(editField);

        WebElement firstNameModifyField = getWebDriver().findElement(By.id("firstName"));
        String firstNameModifyValue = "Vlad";
        elementMethods.refillElement(firstNameModifyField,firstNameModifyValue);

        WebElement userAgeModifyField = getWebDriver().findElement(By.id("age"));
        String userAgeModifyValue = "29";
        elementMethods.refillElement(userAgeModifyField,userAgeModifyValue);

        WebElement submitModifyField = getWebDriver().findElement(By.id("submit"));
        elementMethods.clickElement(submitModifyField);

//stergem noul entry

        WebElement deleteButton = getWebDriver().findElement(By.id("delete-record-4"));
        elementMethods.clickElement(deleteButton);


//inchidem un browser = quit()
//inchidem un tab = close()





    }
}

