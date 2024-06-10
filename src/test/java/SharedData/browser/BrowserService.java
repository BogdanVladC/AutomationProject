package SharedData.browser;

import java.util.Map;

public interface BrowserService {
    //aceastea interfata are ca rol sa defineasca actiunile pe care le putem face un browser

    void openBrowser(Map<String,String>testData);
    Object getBrowserOptions(Map<String,String> testData);


}
