package ReusableClasses;

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

public class Reusable_Actions {

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
        //set the condition to headless
        //options.addArguments("headless");
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
    public static void clickActions(WebDriver driver, String xpath, String elementName){
        WebDriverWait wait = new WebDriverWait(driver, to);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.click();
        }catch (Exception e){
            System.out.println("Unable to hover to element " + elementName + "   " + e);
        }
    }//end of clickActions action

    public static void submitActions(WebDriver driver, String xpath, String elementName){
        WebDriverWait wait = new WebDriverWait(driver, to);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.submit();
        }catch (Exception e){
            System.out.println("Unable to submit to element " + elementName + "   " + e);
        }
    }//end of clickActions action

    //set up sendKeysActions
    public static void sendKeysActions(WebDriver driver, String xpath, String uservalue,String elementName){
        WebDriverWait wait = new WebDriverWait(driver, to);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.click();
            element.clear();
            element.sendKeys(uservalue);
        }catch (Exception e){
            System.out.println("Unable to send keys to element " + elementName + "   " + e);
        }
    }//end of sendkeys action

    //setup gettext action
    public static String getTextActions(WebDriver driver, String xpath, String elementName){
        WebDriverWait wait = new WebDriverWait(driver, to);
        String result = null;
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            result = element.getText();

        }catch (Exception e){
            System.out.println("Unable to get text to element " + elementName + "   " + e);
        }
        return result;
    }//end of getText action

    //create a click by index method
    public static void clickByIndexAction(WebDriver driver,String xpath, int indexNumber, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,to);
        try{
            WebElement element = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath))).get(indexNumber);
            element.click();
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
        }
    }//end of clickByIndexAction

    //create a get title method
    public static String getTitle(WebDriver driver){
        String actualTitle = driver.getTitle();
        if (actualTitle.equals("")) {
            System.out.println("My title  " + actualTitle);
        } else {
            System.out.println("The title is " + actualTitle);
        }
        return actualTitle;
    }//end of get title method

    //create a switch tabs method
     public static String tabs(WebDriver driver, int index){
         ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
         driver.switchTo().window(tabs.get(index));
         return tabs.get(index);
     }//end of switch tabs method

    //create a select by text method
    public static void selectByText(WebDriver driver, String xpath, String userValue, String elementName){
        WebDriverWait wait = new WebDriverWait(driver, to);
    try {
        WebElement menu = driver.findElement(By.xpath(xpath));
            Select dropDown = new Select(menu);
            dropDown.selectByVisibleText(userValue);
        }catch (Exception e){
            System.out.println("Unable to select to element " + elementName + "   " + e);
        }
    }//end of select by text method

    //create a boolean method
    public static void booleanSelect(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, to);
        try {

            Boolean elementState = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).isSelected();
            System.out.println("is the check box selected? " + elementState);
        }catch (Exception e){
            System.out.println("Unable to select " + elementName + "  " + e);
        }

    }//end of booleanselect method

    //create booleandisplayed method
    public static void booleanDisplayed(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, to);
        try {

            Boolean elementState = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).isDisplayed();
            System.out.println(elementName + " is displayed " + elementState);
        } catch (Exception e) {
            System.out.println("Unable to select " + elementName + "  " + e);
        }
    }//end of boolean displayed method

    //create a boolean enabled method
    public static void booleanEnabled(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, to);
        try {

            Boolean elementState = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).isEnabled();
            System.out.println(elementName + " is Enabled " + elementState);
        } catch (Exception e) {
            System.out.println("Unable to select " + elementName + "  " + e);
        }
    }//end of boolean enabled method
    public static void booleanDisplayedByIndex(WebDriver driver, String xpath, int indexNumber, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, to);
        try {

            Boolean elementState = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(indexNumber).isDisplayed();
            System.out.println(elementName + " is displayed " + elementState);
        } catch (Exception e) {
            System.out.println("Unable to select " + elementName + "  " + e);
        }
    }
    public static void booleanSelectedByIndex(WebDriver driver, String xpath, int indexNumber, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, to);
        try {

            Boolean elementState = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(indexNumber).isSelected();
            System.out.println(elementName + " is Selected " + elementState);
        } catch (Exception e) {
            System.out.println("Unable to select " + elementName + "  " + e);
        }
    }

    public static void booleanEnabledByIndex(WebDriver driver, String xpath, int indexNumber, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, to);
        try {

            Boolean elementState = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(indexNumber).isEnabled();
            System.out.println(elementName + " is Enabled " + elementState);
        } catch (Exception e) {
            System.out.println("Unable to select " + elementName + "  " + e);
        }
    }



}//end of reusable actions
