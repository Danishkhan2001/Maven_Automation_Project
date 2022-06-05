package ActionItems.ActionItem_3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Bing_ForLoop_Testing {
    public static void main(String[] args) throws InterruptedException {
        //setup you chromedriver with web driver manager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to maximize
        options.addArguments("start-maximized");
        //define the web driver we are going to use
        WebDriver driver = new ChromeDriver(options);
        //capture search number and print for following cities using arraylist and for loop
        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("Paintball");
        hobbies.add("Axe Throwing");
        hobbies.add("Go Karting");
        hobbies.add("Shooting Range");
        hobbies.add("Bowling");
        for (int i = 0; i < hobbies.size(); i++) {
            //goto bing home page
            driver.navigate().to("https://www.bing.com");
            Thread.sleep(3000);
            //find element for search field and type cars
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(hobbies.get(i));
            //submit on bing search button
            driver.findElement(By.xpath("//*[@id='search_icon']")).submit();
            Thread.sleep(4000);
            //capture the bing search result and print it
            String searchResult = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();
            //extract out the number and print the search number only
            String[] arrayResult = searchResult.split(" ");
            System.out.println("My search number for hobby " + hobbies.get(i) + " is " + arrayResult[0]);
        }//end of for loop
        // close the chrome
        driver.close();
    }//end of main
}//end of java
