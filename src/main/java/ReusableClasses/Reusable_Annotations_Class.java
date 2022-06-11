package ReusableClasses;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public class Reusable_Annotations_Class {
    //set all global variables here with public static
    public static WebDriver driver;
    public static ExtentReports reports;
    public static ExtentTest logger;

    //set before suite report path and set driver
    @BeforeSuite
    public void setDriver(){
        driver = Reusable_Actions.driver();
        reports = new ExtentReports("src/main/java/HTML_Report/Automation.html", true);
    }//end of beforesuite annotation

    //set a before method to capture the test name for each @test, so it can be added to each html report
    @BeforeMethod
    public void getTestName(Method testName){
        logger = reports.startTest(testName.getName());
    }//end of before method

    //set a after method to end the logger in your each test class
    @AfterMethod
    public void endLogger(){
        reports.endTest(logger);
    }//end of after method

    //set an after suite to flush the reports and close browser
    @AfterSuite
    public void endTest(){
        reports.flush();
        driver.quit();
    }//end of after suite annotation
}//end of class
