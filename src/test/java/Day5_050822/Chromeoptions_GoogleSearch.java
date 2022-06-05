package Day5_050822;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chromeoptions_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
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

        //goto google home page
        driver.navigate().to("https://www.google.com");
        Thread.sleep(3000);
        //maximize the window once open
        //driver.manage().window().maximize();
        //find element for search field and type cars
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");
        //submit on google search button
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();
        //capture the google search result and print it
        String searchResult = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        System.out.println("My search result is "+ searchResult);
        //extract out the number and print the search number only
        String[] arrayResult = searchResult.split(" ");
        System.out.println("My search number is " + arrayResult[1]);
        // close the chrome
        //driver.close();
    }//end of main
}//end of class
