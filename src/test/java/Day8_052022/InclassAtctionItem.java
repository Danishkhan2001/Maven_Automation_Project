package Day8_052022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class InclassAtctionItem {
    public static void main(String[] args) throws InterruptedException {
        //set up your chrome driver with web-driver manager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximize
        options.addArguments("start-maximized");
        //define web driver we are going to use
        WebDriver driver = new ChromeDriver(options);

        //create an arraylist for location
        ArrayList<String> location = new ArrayList<>();
        location.add("San Francisco");
        location.add("Honolulu");
        location.add("Fort Lauderdale");

        //create an arraylist for checkin dates
        ArrayList<String> checkIn = new ArrayList<>();
        checkIn.add("Jun 6, 2022");
        checkIn.add("Jun 13, 2022");
        checkIn.add("Jun 20, 2022");

        //Create an arraylist for checkout dates
        ArrayList<String> checkOut = new ArrayList<>();
        checkOut.add("Jun 12, 2022");
        checkOut.add("Jun 19, 2022");
        checkOut.add("Jun 26, 2022");
       for (int i =0; i < location.size(); i++) {
        //navigate to hotels.com
        driver.navigate().to("https://www.Hotels.com");
        Thread.sleep(3000);
        //declare webelement
        WebElement locationBar = driver.findElement(By.xpath("//*[@aria-label='Going to']"));
        locationBar.click();
        locationBar.clear();
        locationBar.sendKeys(location.get(i));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@aria-label='"+checkIn.get(i)+"']")).click();
        driver.findElement(By.xpath("//*[@aria-label='"+checkOut.get(i)+"']")).click();

       }//end of for loop
        //driver.quit();
    }//end of main
}//end of java
