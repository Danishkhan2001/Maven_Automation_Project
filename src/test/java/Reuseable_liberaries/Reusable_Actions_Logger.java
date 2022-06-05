package Reuseable_liberaries;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class Reusable_Actions_Logger {

    //set up a static variable for wait timeout
    static int to = 12;
    //set up webdriver reusable method
    public static WebDriver driver(){
        //set up your chrome driver with web-driver manager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximize
        options.addArguments("start-maximized");
        //define web driver we are going to use
        WebDriver driver = new ChromeDriver(options);
        return driver;
    }//end of webdriver reusable method

    //setup mouse hover actions
    public static void mouseHover(WebDriver driver, String xpath, String elementName){
        WebDriverWait wait = new WebDriverWait(driver, to);
        Actions actions = new Actions(driver);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            actions.moveToElement(element).perform();
        }catch (Exception e){
            System.out.println("Unable to hover to element " + elementName + "   " + e);
        }
    }//end of mouseHover action

    //set up clickActions
    public static void clickActions(WebDriver driver, String xpath,ExtentTest logger,String elementName){
        WebDriverWait wait = new WebDriverWait(driver, to);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.click();
            logger.log(LogStatus.PASS,"Successfully click on " + elementName);
        }catch (Exception e){
            System.out.println("Unable to hover to element " + elementName + "   " + e);
            logger.log(LogStatus.FAIL,"unable to click on " + elementName + "  " + e);

        }
    }//end of clickActions action

    public static void submitActions(WebDriver driver, String xpath, ExtentTest logger, String elementName){
        WebDriverWait wait = new WebDriverWait(driver, to);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.submit();
            logger.log(LogStatus.PASS,"Successfully enter user value on element " + elementName);
        }catch (Exception e){
            System.out.println("Unable to submit to element " + elementName + "   " + e);
            logger.log(LogStatus.FAIL,"unable to enter user value " + elementName + "  " + e);
        }
    }//end of clickActions action

    //set up sendKeysActions
    public static void sendKeysActions(WebDriver driver, String xpath, String uservalue,ExtentTest logger, String elementName){
        WebDriverWait wait = new WebDriverWait(driver, to);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.click();
            element.clear();
            element.sendKeys(uservalue);
            logger.log(LogStatus.PASS,"Successfully enter user value on element " + elementName);
        }catch (Exception e){
            System.out.println("Unable to send keys to element " + elementName + "   " + e);
            logger.log(LogStatus.FAIL,"unable to enter user value " + elementName + "  " + e);
        }
    }//end of sendkeys action

    //setup gettext action
    public static String getTextActions(WebDriver driver, String xpath, ExtentTest logger,String elementName){
        WebDriverWait wait = new WebDriverWait(driver, to);
        String result = null;
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            result = element.getText();
            logger.log(LogStatus.PASS,"Successfully enter user value on element " + elementName);

        }catch (Exception e){
            System.out.println("Unable to get text to element " + elementName + "   " + e);
            logger.log(LogStatus.FAIL,"unable to enter user value " + elementName + "  " + e);
        }
        return result;
    }//end of getText action

    //create a boolean method
    public static void booleanSelect(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, to);
        try {

            Boolean elementState = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).isSelected();
            System.out.println(elementName +" is selected? " + elementState);
            logger.log(LogStatus.PASS,elementName + " is Successfully selected");
        }catch (Exception e){
            System.out.println("Unable to select " + elementName + "  " + e);
            logger.log(LogStatus.FAIL,"unable to Select " + elementName + "  " + e);
        }

    }//end of booleanselect method

    //create booleandisplayed method
    public static void booleanDisplayed(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, to);
        try {

            Boolean elementState = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).isDisplayed();
            System.out.println(elementName + " is displayed " + elementState);
            logger.log(LogStatus.PASS,elementName + " is Successfully displayed");
        } catch (Exception e) {
            System.out.println("Unable to select " + elementName + "  " + e);
            logger.log(LogStatus.FAIL,"unable to displayed " + elementName + "  " + e);
        }
    }//end of boolean displayed method

    //create a boolean enabled method
    public static void booleanEnabled(WebDriver driver, String xpath,ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, to);
        try {

            Boolean elementState = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).isEnabled();
            System.out.println(elementName + " is Enabled " + elementState);
            logger.log(LogStatus.PASS,elementName + " is Successfully enabled");
        } catch (Exception e) {
            System.out.println("Unable to select " + elementName + "  " + e);
            logger.log(LogStatus.FAIL,"unable to Enabled " + elementName + "  " + e);
        }
    }//end of boolean enabled method
    public static void booleanDisplayedByIndex(WebDriver driver, String xpath, int indexNumber,ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, to);
        try {

            Boolean elementState = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(indexNumber).isDisplayed();
            System.out.println(elementName + " is displayed " + elementState);
            logger.log(LogStatus.PASS,elementName + " is Successfully displayed");
        } catch (Exception e) {
            System.out.println("Unable to select " + elementName + "  " + e);
            logger.log(LogStatus.FAIL,"unable to displayed " + elementName + "  " + e);
        }
    }
    public static void booleanSelectedByIndex(WebDriver driver, String xpath, int indexNumber, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, to);
        try {

            Boolean elementState = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(indexNumber).isSelected();
            System.out.println(elementName + " is Selected " + elementState);
            logger.log(LogStatus.PASS,elementName + " is Successfully Selected");
        } catch (Exception e) {
            System.out.println("Unable to select " + elementName + "  " + e);
            logger.log(LogStatus.FAIL,"unable to Select " + elementName + "  " + e);
        }
    }

    public static void booleanEnabledByIndex(WebDriver driver, String xpath, int indexNumber, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, to);
        try {

            Boolean elementState = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(indexNumber).isEnabled();
            System.out.println(elementName + " is Enabled " + elementState);
            logger.log(LogStatus.PASS,elementName + " is Successfully enabled");
        } catch (Exception e) {
            System.out.println("Unable to select " + elementName + "  " + e);
            logger.log(LogStatus.FAIL,"unable to enabled " + elementName + "  " + e);
        }
    }
    public static void clickActionsByIndex(WebDriver driver, String xpath, int indexNumber, ExtentTest logger,String elementName){
        WebDriverWait wait = new WebDriverWait(driver, to);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.click();
            logger.log(LogStatus.PASS,"Successfully click on " + elementName);
        }catch (Exception e){
            System.out.println("Unable to hover to element " + elementName + "   " + e);
            logger.log(LogStatus.FAIL,"unable to click on " + elementName + "  " + e);

        }
    }//end of clickActions action







}
