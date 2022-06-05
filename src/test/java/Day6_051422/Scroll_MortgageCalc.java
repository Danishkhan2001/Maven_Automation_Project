package Day6_051422;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_MortgageCalc {
    public static void main(String[] args) throws InterruptedException {
        //scroll down and up mortgage calculator website
        //setup you chromedriver with web driver manager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //se the condition to incognito mode
        options.addArguments("Incognito");
        //set the condition to maximize
        options.addArguments("start-maximized");
        //define the web driver we are going to use
        WebDriver driver = new ChromeDriver(options);

        //navigate to mortgagecalculator.org home page
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(3000);
        //scroll down the page
       JavascriptExecutor jse = (JavascriptExecutor)driver;
        //jse.executeScript("scroll(0,40000)");
        //Thread.sleep(1000);
        //Thread.sleep(1000);
        //scroll down the page
        //jse.executeScript("scroll(0,40000)");

        //declare webelement
        WebElement shareButton = driver.findElement(By.xpath("//*[@id= 'share_button']"));
        jse.executeScript("arguments[0].scrollIntoView(true);",shareButton);
        Thread.sleep(3000);
        //click on share button
        shareButton.click();
        Thread.sleep(1500);
        //scroll up the page
        jse.executeScript("scroll(-40000,0)");
        Thread.sleep(1000);
        driver.quit();
    }//end of main
}//end of java
