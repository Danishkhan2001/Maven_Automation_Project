package Day11_052922;


import Reuseable_liberaries.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class listElement_Testing {
    public static void main(String[] args) {

        // setup you driver
        WebDriver driver = Reusable_Actions.driver();
        //navigate to usps.com
        driver.navigate().to("https://www.usps.com");
        //get the webelement list
        List<WebElement> tabsCount = driver.findElements(By.xpath("//li[contains(@class,'menuheader')]"));
        System.out.println("tab count is " + tabsCount.size() );


    }//end of main
}//end of java class
