package Day6_051422;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementsExample {
    public static void main(String[] args) throws InterruptedException {
        //go to bing and click on the second element of the links by using class and index

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

        //goto bing home page
        driver.navigate().to("https://www.bing.com");
        Thread.sleep(3000);
        //click on images using class property with index of 1
        //to ignore white space in the property value we can use contains in xpath
        driver.findElements(By.xpath("//li[contains(@class,'scope')]")).get(2).click();
        Thread.sleep(5000);
        driver.quit();
                    }//end of main
}//end of class


