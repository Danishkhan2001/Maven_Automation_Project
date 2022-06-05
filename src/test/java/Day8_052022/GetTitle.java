package Day8_052022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTitle {
    public static void main(String[] args) throws InterruptedException {
        //set up chrome driver with web driver
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //open in incognito mode
        options.addArguments("incognito");
        //maximize the window
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        //navigate to google webpage
        driver.navigate().to("https://www.Google.com/");
        Thread.sleep(3000);
        String actualTitle = driver.getTitle();
        if (actualTitle.equals("GOOGLE")){
            System.out.println("My title Matches");
        }else {
            System.out.println("My title Doesn't matches, actual title is " + actualTitle);
        }

    }//end of main
}//end of java
