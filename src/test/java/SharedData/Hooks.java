package SharedData;

import LoggerUtillity.LoggerUtillity;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks extends SharedData {

    private String testName;


    @BeforeMethod
    public void prepareEnvironment(){
        testName = this.getClass().getSimpleName();
        LoggerUtillity.startTestCase(testName);
        prepareDriver();
        LoggerUtillity.infoTest("The driver opened successfully");

    }

    @AfterMethod
    public void clearEnvironment(){
        clearDriver();
        LoggerUtillity.infoTest("The driver closed successfully");
        LoggerUtillity.finishTestCase(testName);
    }

}
