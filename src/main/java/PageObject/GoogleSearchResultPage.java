package PageObject;

import ReusableClasses.Reusable_Actions_POM_Logger;
import ReusableClasses.Reusable_Annotations_Class;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchResultPage extends Reusable_Annotations_Class{

    ExtentTest logger;
    public GoogleSearchResultPage(WebDriver driver){
        //page factory function for the page object
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations_Class.logger;
    }//end of constructor
    //define all the webelements using @find by concept
    @FindBy(xpath = "//*[@id='result-stats']")
    WebElement searchResult;

    public void captureSearchResultAndPrintIt(){
       String result = Reusable_Actions_POM_Logger.getTextActions(driver, searchResult,logger,"Search Result");
       String[] arrayResult = result.split(" ");
        System.out.println("My result is " + arrayResult[1]);
        logger.log(LogStatus.INFO,"My result is " + arrayResult[1]);
    }//end of google search result

}//end of class
