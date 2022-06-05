package Day7_051522;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class Exception_MortgageCalc {
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

        //create an arraylist for purchase price
        ArrayList<String> pPrice = new ArrayList<>();
        pPrice.add("450000");
        pPrice.add("475000");
        pPrice.add("500000");

        //crate an arraylist for down payment
        ArrayList<String> dPymt = new ArrayList<>();
        dPymt.add("100000");
        dPymt.add("150000");
        dPymt.add("200000");

        //Create an arraylist for Start month
        ArrayList<String> sMonth = new ArrayList<>();
        sMonth.add("Oct");
        sMonth.add("Nov");
        sMonth.add("Dec");

        //start a for loop
        for (int i = 0; i < pPrice.size(); i++) {
            //navigate to mortgagecalculator.org
            driver.navigate().to("https://www.mortgagecalculator.org");
            Thread.sleep(3000);
            //handle exception for home value
            try {
                WebElement homeVal = driver.findElement(By.xpath("//*[@id='homeval']"));
                homeVal.clear();
                homeVal.sendKeys(pPrice.get(i));
            } catch (Exception e) {
                System.out.println("Unable to locate home value " + e);
            }//end of home value exception
            //handle exception for down payment
            try {
                WebElement downPayment = driver.findElement(By.xpath("//*[@id='downpayment']"));
                downPayment.clear();
                downPayment.sendKeys(dPymt.get(i));
            } catch (Exception e) {
                System.out.println("Unable to find downpayment " + e);
            }//end of down payment exception
            //handle exception for start month
            try {
                WebElement startMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));
                Select dropDown = new Select(startMonth);
                dropDown.selectByVisibleText(sMonth.get(i));
            } catch (Exception e) {
                System.out.println("Unable to find start month dropdown " + e);
            }//end of start month exception
            //handle exception for calculate
            try {
                driver.findElement(By.xpath("//*[@value='Calculate']")).click();
            } catch (Exception e) {
                System.out.println("Unable to find Calculate Button " + e);
            }//end of calculate exception
            Thread.sleep(1500);
            //handle exception for monthly payment
            try {
                String monthlyPayment = driver.findElements(By.xpath("//div[@class= 'left-cell']")).get(0).getText();
                System.out.println("My monthly payment is " + monthlyPayment);
            } catch (Exception e) {
                System.out.println("Unable to find monthly payment " + e);
            }//end of monthly payment exception
        }//end of for loop
        Thread.sleep(1500);
        driver.quit();
    }//end of main
}//end of java
