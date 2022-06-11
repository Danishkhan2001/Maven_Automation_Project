package PageObject;

import ReusableClasses.Reusable_Annotations_Class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass extends Reusable_Annotations_Class {

    public BaseClass(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public static GoogleHomePage googleHomePage(){
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        return  googleHomePage;
    }//end of google homepage

    public static GoogleSearchResultPage googleSearchResultPage(){
        GoogleSearchResultPage googleSearchResultPage = new GoogleSearchResultPage(driver);
        return  googleSearchResultPage;
    }//end of google homepage


}
