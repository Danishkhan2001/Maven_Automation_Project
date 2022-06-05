package Day10_052822;

import Reuseable_liberaries.Reusable_Actions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class googleArrayList_TestNG {

    WebDriver driver;


    //set up  a browser
    @BeforeSuite
    public void browser(){
        driver = Reusable_Actions.driver();
    }//end of before suite annotation

    //create an arraylist and test it

    @Test
    public void googleTest() {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Rolls Royce");

        for (int i = 0; i < cars.size(); i++) {
            driver.navigate().to("https://www.google.com");
            Reusable_Actions.sendKeysActions(driver, "//*[@name='q']", cars.get(i), "search filed");
            Reusable_Actions.submitActions(driver, "//*[@name='btnK']", "submit button");
            //capture the result
            String result = Reusable_Actions.getTextActions(driver, "//*[@id='result-stats']", "Search Result");

            String[] arrayResult = result.split(" ");
            System.out.println("My search Result for " + cars.get(i) + " is " + arrayResult);
        }//end of for loop
    }//end of test annotation

    @AfterSuite
    public void close(){
        driver.quit();
        }//end of after suite annotation



}//end of java
