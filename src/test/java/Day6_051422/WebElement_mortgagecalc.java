package Day6_051422;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class WebElement_mortgagecalc {
    public static void main(String[] args) throws InterruptedException {
        //setup your chromedriver with web driver manager
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

        //click, clear,and enter new home value
        WebElement homeValue = driver.findElement(By.xpath("//*[@id='homeval']"));
        homeValue.click();
        homeValue.clear();
        homeValue.sendKeys("450000");

        //click on % radio button
        driver.findElement(By.xpath("//*[@value='percent']")).click();
        Thread.sleep(1000);
        //click back on $ radio button
        driver.findElement(By.xpath("//*[@value= 'money']")).click();
        Thread.sleep(1000);
        //click, clear,and enter new Down payment
        WebElement downPayments = driver.findElement(By.xpath("//*[@id='downpayment']"));
        downPayments.click();
        downPayments.clear();
        downPayments.sendKeys("120000");
        Thread.sleep(5000);
        driver.quit();
    }//end of main
}//end of java 
