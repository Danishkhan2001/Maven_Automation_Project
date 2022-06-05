package Day10_052822;

import Reuseable_liberaries.Reusable_Actions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_Example {

    //declare web browser
    WebDriver driver;

    //setup browser
    @BeforeSuite
    public void webBrowser(){
        driver = Reusable_Actions.driver();
    }//end of browser setup

    //navigate to google and search
    @Test(priority = 1)
    public void google(){
        driver.navigate().to("https://www.google.com");
        Reusable_Actions.sendKeysActions(driver, "//*[@name='q']", "bmw", "search");
        Reusable_Actions.submitActions(driver,"//*[@name='btnK']", "search button");
    }//end of search annotation

    @Test(dependsOnMethods = "google")
    public void result(){
        //capture the search result
        String result = Reusable_Actions.getTextActions(driver,"//*[@id='result-stats']", "search result");
        //split the result by single space
        String [] arrayResult = result.split(" ");
        System.out.println("search result is " + arrayResult[1]);
    }//end of search result
    @AfterSuite
    public void close(){
        //quit the browser
        driver.quit();
    }//end of after annotations

}//end of java class
