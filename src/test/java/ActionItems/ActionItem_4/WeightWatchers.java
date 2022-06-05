package ActionItems.ActionItem_4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class WeightWatchers {
    public static void main(String[] args) throws InterruptedException {
        //set up driver with chrome
        WebDriverManager.chromedriver().setup();
        //set up option arguments for chrome
        ChromeOptions options = new ChromeOptions();
        //open chrome in incognito mode
        options.addArguments("incognito");
        //maximize the window once open
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);

        //create an arraylist for zipcodes
        ArrayList<String> zipCodes = new ArrayList<>();
        zipCodes.add("11580");
        zipCodes.add("11356");
        zipCodes.add("11426");
        //start a for loop
        for (int i = 0; i< zipCodes.size(); i++){
        //navigate to weightwatchers webpage
        driver.navigate().to("https://www.weightwatchers.com/");
        Thread.sleep(3000);
        //click on the attend button and choose unlimited wrokshops
        driver.findElement(By.xpath("//*[@da-label='Attend']")).click();
        Thread.sleep(1000);
        //handle exception for unlimited workshops
        try {
            driver.findElements(By.xpath("//*[text()= 'Unlimited Workshops']")).get(1).click();
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println("Unable to find a workshop " + e);
        }//end of unlimited workshop exception
            Thread.sleep(2000);
            //handle exception for studio
            try {
            driver.findElements(By.xpath("//*[@class='buttonText-3DCCO']")).get(1).click();
        }catch (Exception e){
            System.out.println("Unable to find studio " + e);
        }//end of studio exception
        //enter zipcodes with a handle exception
        try {
            WebElement enterZipCode = driver.findElement(By.xpath("//*[@id='location-search']"));
            enterZipCode.sendKeys(zipCodes.get(i));
        }catch (Exception e){
            System.out.println("Unable to enter zipcode " + e);
        }//end of zipcode exception
         //handle click exception
            try {
                driver.findElement(By.xpath("//*[@class='rightArrow-daPRP']")).click();
            }catch (Exception e){
                System.out.println("Unable to click to search button "+ e);
            }//end of search exception
            Thread.sleep(2000);
            //handle exception for first location
            try {
                driver.findElements(By.xpath("//*[@class='linkUnderline-1_h4g']")).get(0).click();
            }catch (Exception e){
                System.out.println("Unable to open location " + e);
            }//end of first location exception

            //handle exception for address
            try {
                String address = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();
                System.out.println("The address is for closest location " + address);
            }catch (Exception e){
                System.out.println("Unable to see address " + e);
            }//end of address exception

            //scroll down to hours
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("scroll(0,150)");
            //declare web element
            //WebElement downArrow = driver.findElement(By.xpath("//*[@class='hoursIcon-II-H2']"));
            //jse.executeScript("arguments[0].scrollIntoView(true);",downArrow);
            Thread.sleep(1000);

            //capture the hours with handle exception
            try {
                driver.findElement(By.xpath("//*[@class='hoursIcon-II-H2']")).click();
                Thread.sleep(500);
                String day1 = driver.findElements(By.xpath("//*[@class='day-CZkDC']")).get(0).getText();
                String day2 = driver.findElements(By.xpath("//*[@class='day-CZkDC']")).get(1).getText();
                String day3 = driver.findElements(By.xpath("//*[@class='day-CZkDC']")).get(2).getText();
                String day4 = driver.findElements(By.xpath("//*[@class='day-CZkDC']")).get(3).getText();
                String day5 = driver.findElements(By.xpath("//*[@class='day-CZkDC']")).get(4).getText();
                String day6 = driver.findElements(By.xpath("//*[@class='day-CZkDC']")).get(5).getText();
                String day7 = driver.findElements(By.xpath("//*[@class='day-CZkDC']")).get(6).getText();
                System.out.println("The hours for closest location are " + day1 + day2 + day3 + day4 + day5 + day6 + day7);
            }catch (Exception e){
                System.out.println("Unable to click hours button and check hours " + e);
            }//end of hours exception
        }//end of for loop


        driver.quit();
    }//end of main
}//end of java
