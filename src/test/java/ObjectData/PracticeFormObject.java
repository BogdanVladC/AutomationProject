package ObjectData;

import java.util.List;
import java.util.Map;

public class PracticeFormObject  extends GeneralObject{
    private String firstNameValue;
    private String lastNameValue;
    private String userEmailValue;
    private String userMobileNumberValue;
    private String monthValue;
    private String yearValue;
    private String dayValue;
    private List<String> hobbies;
    private String addressFieldValue;
    private String genderValue;
    private String subjectsValue;
    private String filePath;
    private String selectStateInputValue;
    private String inputCityFieldValue;

    public PracticeFormObject(Map<String,String> testData){
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
                case "userMobileNumberValue":
                    setUserMobileNumberValue(testData.get(key));
                    break;
                case"monthValue":
                    setMonthValue(testData.get(key));
                    break;
                case "yearValue":
                    setYearValue(testData.get(key));
                    break;
                case "dayValue":
                    setDayValue(testData.get(key));
                    break;
                case "hobbies":
                    hobbies = getPreparedValue(testData.get(key));
                    break;
                case "addressFieldValue":
                    setAddressFieldValue(testData.get(key));
                    break;
                case "genderValue":
                    setGenderValue(testData.get(key));
                    break;
                case "subjectsValue":
                    setSubjectsValue(testData.get(key));
                    break;
                case "filePath":
                    setFilePath(testData.get(key));
                    break;
                case "inputCityFieldValue":
                    setInputCityFieldValue(testData.get(key));
                    break;
                case "selectStateInputValue":
                    setSelectStateInputValue(testData.get(key));
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

    public String getUserMobileNumberValue() {
        return userMobileNumberValue;
    }

    public void setUserMobileNumberValue(String userMobileNumberValue) {
        this.userMobileNumberValue = userMobileNumberValue;
    }

    public String getMonthValue() {
        return monthValue;
    }

    public void setMonthValue(String monthValue) {
        this.monthValue = monthValue;
    }

    public String getYearValue() {
        return yearValue;
    }

    public void setYearValue(String yearValue) {
        this.yearValue = yearValue;
    }

    public String getDayValue() {
        return dayValue;
    }

    public void setDayValue(String dayValue) {
        this.dayValue = dayValue;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public String getAddressFieldValue() {
        return addressFieldValue;
    }

    public void setAddressFieldValue(String addressFieldValue) {
        this.addressFieldValue = addressFieldValue;
    }

    public String getGenderValue() {
        return genderValue;
    }

    public void setGenderValue(String genderValue) {
        this.genderValue = genderValue;
    }

    public String getSubjectsValue() {
        return subjectsValue;
    }

    public void setSubjectsValue(String subjectsValue) {
        this.subjectsValue = subjectsValue;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getSelectStateInputValue() {
        return selectStateInputValue;
    }

    public void setSelectStateInputValue(String selectStateInputValue) {
        this.selectStateInputValue = selectStateInputValue;
    }

    public String getInputCityFieldValue() {
        return inputCityFieldValue;
    }

    public void setInputCityFieldValue(String inputCityFieldValue) {
        this.inputCityFieldValue = inputCityFieldValue;
    }
}
