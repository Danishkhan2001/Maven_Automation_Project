package Day11_052922;

import Reuseable_liberaries.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

public class USPS_ListElement {

    WebDriver driver;

    @BeforeSuite()
    public void browser(){
        driver = Reusable_Actions.driver();
    }//end of before suite annotation

    @Test()
    public void USPS_Tabs_Count(){
        //navigate to usps.com
        driver.navigate().to("https://www.usps.com");
        //explicit the wait
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //store the navigation tabs and count the tabs
        List<WebElement> tabsCount = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[contains(@class,'menuheader')]")));
        //print the tabs count
        System.out.println("My tab count is " + tabsCount.size());
        for (int i =0; i<tabsCount.size(); i++){
            driver.navigate().to("https://www.usps.com");
            tabsCount = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[contains(@class,'menuheader')]")));
            //click on each one
            tabsCount.get(i).click();
        }//end of loop
    }//end of test

    @AfterSuite
    public void close(){
        driver.quit();
    }//end of after annotations


}//end of java
