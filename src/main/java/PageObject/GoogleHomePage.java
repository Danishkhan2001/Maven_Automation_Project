package PageObject;

import ReusableClasses.Reusable_Actions_POM_Logger;
import ReusableClasses.Reusable_Annotations_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage extends Reusable_Annotations_Class {

    //declare the extent test for each page object class
    ExtentTest logger;
    //create a constructor method that will reference the same name as your class
    //page object class methods are static when you use the in your test class
    public GoogleHomePage(WebDriver driver){
        //page factory function for the page object
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations_Class.logger;
        }//end of constructor
    //define all the webelements using @find by concept
    @FindBy(xpath = "//*[@name='q']")
    WebElement searchFeild;
    @FindBy(xpath = "//*[@name= 'btnK']")
    WebElement googleSearchButton;

    public void searchUserValue(String userValue){
        Reusable_Actions_POM_Logger.sendKeysActions(driver, searchFeild, userValue, logger, "search Field");
    }//end of enter userValue
    public void submitSearch(){
        Reusable_Actions_POM_Logger.submitActions(driver, googleSearchButton,logger,"Seach Button");
    }//end of google search result
}//end of class