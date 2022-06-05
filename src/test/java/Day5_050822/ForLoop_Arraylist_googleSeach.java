package Day5_050822;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class ForLoop_Arraylist_googleSeach {
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

        //capture search number and print for following cities using arraylist and for loop
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Bronx");
        for (int i = 0; i < cities.size(); i++) {
            //goto google home page
            driver.navigate().to("https://www.google.com");
            Thread.sleep(3000);
            //maximize the window once open
            //driver.manage().window().maximize();
            //find element for search field and type cars
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(cities.get(i));
            //submit on google search button
            driver.findElement(By.xpath("//*[@name='btnK']")).submit();
            //capture the google search result and print it
            String searchResult = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
            System.out.println("My search result is "+ searchResult);
            //extract out the number and print the search number only
            String[] arrayResult = searchResult.split(" ");
            System.out.println("My search number for city " + cities.get(i) + " is " + arrayResult[1]);
        }//end of for loop
        // close the chrome
        driver.close();
    }//end of main
}//end of class
