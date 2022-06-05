package Day7_051522;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class FidelisCare_Tabs {
    public static void main(String[] args) throws InterruptedException {
        //set up chrome with web-driver manager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //open chrome in incognito mode
        options.addArguments("incognito");
        //maximize the chrome
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        //navigate to fidelis care webpage
        driver.navigate().to("https://www.fideliscare.org/");
        Thread.sleep(3000);
        //click on shop for a plan
        driver.findElements(By.xpath("//*[text()= 'Shop For a Plan']")).get(0).click();
        //wait for a browser to wait
        Thread.sleep(1500);
        //click on Medicade Managed Care
        driver.findElements(By.xpath("//*[text()= 'Medicaid Managed Care']")).get(0).click();
        Thread.sleep(1500);
        //click on search button
        driver.findElement(By.xpath("//*[@href='/findadoctor']")).click();
        Thread.sleep(3000);
        //store new tabs in arraylist
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to new tab
        driver.switchTo().window(tabs.get(1));
        //click on new search button
        driver.findElement(By.xpath("//*[@class='fal fa-search-plus']")).click();
        //close the new tab
        driver.close();
        driver.switchTo().window(tabs.get(0));
        //click on visit us in previous tab
        driver.findElement(By.xpath("//*[@href='https://www.fideliscare.org/Find-An-Office/office-reopenings']")).click();
    }//end of main
}//end of java
