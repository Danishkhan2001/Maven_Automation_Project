package Day7_051522;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Select_MortgageCalc {
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
        //navigate to mortgage calculator.org
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(3000);
        //select start month from the dropdown menu
        WebElement startMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));
        //define select command
        Select dropDown = new Select(startMonth);
        //select by visible text
        //dropDown.selectByVisibleText("Nov");
        //Thread.sleep(2000);
        //selecting a value from dropdown menu if the dropdown tag is not under select
        startMonth.click();
        driver.findElement(By.xpath("//*[text()='Nov']")).click();

        //select loan type from the dropdown
        WebElement loanType = driver.findElement(By.xpath("//*[@name='param[milserve]']"));
        Select loanTypeDropDown = new Select(loanType);
        loanTypeDropDown.selectByVisibleText("VA");
        Thread.sleep(2000);
        //quit the driver
        driver.quit();
    }//end of main
}//end of java
