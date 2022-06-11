package Day11_052922;

import Reuseable_liberaries.Reusable_Actions;
import Reuseable_liberaries.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class yahooCheckBox_Boolean {
    WebDriver driver;

    @BeforeSuite
    public void browser(){
        driver = Reusable_Actions.driver();
    }

    @Test
    public void checkBox(){
        driver.navigate().to("https://login.yahoo.com");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Boolean elementState =wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='persistent']"))).isSelected();
        System.out.println("is the check box selected? " + elementState);
    }//end of test

    @AfterSuite
    public void quit(){
        driver.quit();
    }

}//end of java
