package ObjectData;

import java.util.Map;

public class WebTableObject {

    private String firstNameValue;
    private String lastNameValue;
    private String userEmailValue;
    private String userAgeValue;
    private String userSalaryValue;
    private String userDepartmentValue;


    //facem o metoda care sa mapeze datele din fisierul de resursa cu reprezentarea acestui obiect;

    public WebTableObject (Map<String, String> testData){
        prepareObject(testData);
    }

    private void prepareObject(Map<String,String>testData){
        for (String key:testData.keySet()){
            switch (key){
                case "firstNameValue":
                    setFirstNameValue(testData.get(key));
                    break;
                case "lastNameValue":
                    setLastNameValue(testData.get(key));
                    break;
                case "userEmailValue":
                    setUserEmailValue(testData.get(key));
                    break;
                case "userAgeValue":
                    setUserAgeValue(testData.get(key));
                    break;
                case"userSalaryValue":
                    setUserSalaryValue(testData.get(key));
                    break;
                case "userDepartmentValue":
                    setUserDepartmentValue(testData.get(key));
                    break;
            }
        }
    }

    public String getFirstNameValue() {
        return firstNameValue;
    }

    public void setFirstNameValue(String firstNameValue) {
        this.firstNameValue = firstNameValue;
    }

    public String getLastNameValue() {
        return lastNameValue;
    }

    public void setLastNameValue(String lastNameValue) {
        this.lastNameValue = lastNameValue;
    }

    public String getUserEmailValue() {
        return userEmailValue;
    }

    public void setUserEmailValue(String userEmailValue) {
        this.userEmailValue = userEmailValue;
    }

    public String getUserAgeValue() {
        return userAgeValue;
    }

    public void setUserAgeValue(String userAgeValue) {
        this.userAgeValue = userAgeValue;
    }

    public String getUserSalaryValue() {
        return userSalaryValue;
    }

    public void setUserSalaryValue(String userSalaryValue) {
        this.userSalaryValue = userSalaryValue;
    }

    public String getUserDepartmentValue() {
        return userDepartmentValue;
    }

    public void setUserDepartmentValue(String userDepartmentValue) {
        this.userDepartmentValue = userDepartmentValue;
    }

}
