package Day9_052222;

import Reuseable_liberaries.Reusable_Actions;
import org.openqa.selenium.WebDriver;

public class USPS_Reusable_Concepts {
    public static void main(String[] args) {
        WebDriver driver = Reusable_Actions.driver();

        //navigate to usps
        driver.navigate().to("https://www.usps.com");

        //hover to quick tools
        Reusable_Actions.mouseHover(driver, "//*[text()= 'Quick Tools']", "Quick Tools");

        //hover to send tab
        Reusable_Actions.mouseHover(driver, "//*[@id='mail-ship-width']", "Send Tabs");

        //click on calculate a price
        Reusable_Actions.clickActions(driver, "//*[@class='tool-calc']", "calculate a price");

        //get the header result
        String result = Reusable_Actions.getTextActions(driver, "//*[@class='header-usps row']", "Header Info");

        //enter zipcode
        Reusable_Actions.sendKeysActions(driver, "//*[@id='Origin']", "11580","Zipcode");

    }//end of main
}//end of java
