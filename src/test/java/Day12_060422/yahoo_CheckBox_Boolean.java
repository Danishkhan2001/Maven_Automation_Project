package Day12_060422;

import ReusableClasses.Reusable_Annotations_Class;
import Reuseable_liberaries.Reusable_Actions;
import Reuseable_liberaries.Reusable_Actions_Logger;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class yahoo_CheckBox_Boolean extends Reusable_Annotations_Class {

    @Test (priority = 1)
    public void checkBox(){
        driver.navigate().to("https://www.yahoo.com");
        //click on sign in
        Reusable_Actions_Logger.clickActions(driver,"//*[text() = 'Sign in']", logger, "sign in");
        //verify that the stay sign in is checked
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Boolean elementState =wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='persistent']"))).isSelected();
        if (elementState == true){
            logger.log(LogStatus.PASS,"Check box is selected as expected");
        }else {
            logger.log(LogStatus.FAIL, "Check box is not selected as expected");
        }
    }//end of test

    @Test (priority = 2)
    public void NavigateToYahooHomepage(){
        logger.log(LogStatus.INFO, "Navigating to yahoo homepage");
        driver.navigate().to("https://www.yahoo.com");
    }

}//end of java
