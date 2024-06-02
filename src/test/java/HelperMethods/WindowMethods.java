package HelperMethods;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class WindowMethods {
    private WebDriver webDriver;
    public WindowMethods(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void switchSpecificTabWindow(Integer index){
        List<String> tabsOpen = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tabsOpen.get(index));
        System.out.println("Tabul current are URL-ul " + webDriver.getCurrentUrl());
    }
    public void closeCurrentWindow (){
        webDriver.close();
    }
}
