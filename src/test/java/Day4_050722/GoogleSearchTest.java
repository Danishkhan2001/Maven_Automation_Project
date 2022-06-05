package Day4_050722;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {
    public static void main(String[] args) {
        //setup you chromedriver with web driver manager
        WebDriverManager.chromedriver().setup();
        //define the web driver we are going to use
        WebDriver driver = new ChromeDriver();

        //goto google home page
        driver.navigate().to("https://www.google.com");
        //maximize the window once open
        driver.manage().window().maximize();
        //find element for search field and type cars
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("restaurants near manhattan");
        //submit on google search button
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();
        //capture the google search result and print it
        String searchResult = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        System.out.println("My search result is "+ searchResult);
        //extract out the number and print the search number only
        String[] arrayResult = searchResult.split(" ");
        //String replaceParanth = arrayResult[3].replace("(","").replace(")","");
        System.out.println("My search number is " + arrayResult[1]);
      
      
        // close the chrome
        driver.close();
    }//end of main
}//end of class
