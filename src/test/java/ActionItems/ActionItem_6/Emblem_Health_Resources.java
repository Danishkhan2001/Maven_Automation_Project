package ActionItems.ActionItem_6;

import Reuseable_liberaries.Reusable_Actions;
import Reuseable_liberaries.Reusable_Actions_Logger;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.apache.hc.core5.reactor.Command;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Emblem_Health_Resources {
    //declare webDriver variable
    WebDriver driver;
    //declare reports variable
    ExtentReports reports;
    //declare logger variable
    ExtentTest logger;

    //set up browser & logger path before testing
    @BeforeSuite
    public void browser(){
        driver = Reusable_Actions.driver();
        reports = new ExtentReports("src/main/java/HTML_Report/Embelm_Health.html",true);
    }//end of BeforeSuite annotation

    // As a User, I would like a pharmacy search box so that it would be easier to navigate.
    @Test(priority = 1)
    public void pharmacySearchBox(){
        //start a logger
        logger = reports.startTest("pharmacy Search Box");
        //navigate to emblem health's resource webpage
        driver.navigate().to("https://www.emblemhealth.com/resources");
        //pharmacy box The box should be 4”x3”.
        Reusable_Actions_Logger.booleanDisplayedByIndex(driver, "//*[@class ='cmp-page-preview-tiles__card-content']", 0, logger,"Pharmacy Search Box");

        //The box should say Pharmacy on top.
        Reusable_Actions_Logger.booleanDisplayedByIndex(driver,"//*[@class ='cmp-page-preview-tiles__card-title']",0,logger,"Pharmacy Heading");

        //There should be a description underneath the line.
        Reusable_Actions_Logger.booleanDisplayedByIndex(driver,"//*[@class ='cmp-page-preview-tiles__card-description']",0,logger,"Description");

        //There should be a link box at the bottom of the box.
        Reusable_Actions_Logger.booleanDisplayed(driver,"//*[@data-click_name='go_to_pharmacy']",logger,"go to Pharmacy");
        //The link should open a new page
        Reusable_Actions_Logger.clickActions(driver,"//*[@data-click_name='go_to_pharmacy']",logger,"go to pharmacy");
        //get the title of new page
        Reusable_Actions.getTitle(driver);
        //end of logger per test
        reports.endTest(logger);
    }//end of first use case
@Test( priority = 2)
//As a User, I would like to add a Medicare member resource center box so that it would be easier to navigate.
public void medicareMember(){
        //start a logger
    logger=reports.startTest("Medicare Member");
    //navigate to emblem health's resource webpage
    driver.navigate().to("https://www.emblemhealth.com/resources");
    //The box should be Displayed.
    Reusable_Actions_Logger.booleanDisplayedByIndex(driver, "//*[@class ='cmp-page-preview-tiles__card-content']", 1, logger,"Medicare Member Box");

    //The box should say Medicare member resource center on top.
    Reusable_Actions_Logger.booleanDisplayedByIndex(driver,"//*[@class ='cmp-page-preview-tiles__card-title']",1,logger,"Medicare Member Heading");

    //There should be a description underneath the line.
    Reusable_Actions_Logger.booleanDisplayedByIndex(driver,"//*[@class ='cmp-page-preview-tiles__card-description']",1,logger,"Medicare Description");

    //There should be a link box at the bottom of the box.
    Reusable_Actions_Logger.booleanDisplayed(driver,"//*[@data-click_name='go_to_medicare_member_resource_center']",logger,"go to Medicare Member Resource Center");
    //the link should open a detailed webpage
    Reusable_Actions_Logger.clickActions(driver,"//*[@data-click_name='go_to_medicare_member_resource_center']",logger,"go to medicare member webpage");
    //get the title of new page
    Reusable_Actions.getTitle(driver);
    //end of logger per test
    reports.endTest(logger);
}//end of use case 2
    @Test(priority = 3)
    //As a User, I would like to add a Forms & Documents box so that it would be easier to navigate.
    public void Forms_Documents(){
        //start a logger
        logger = reports.startTest("Forms_Documents");
        //navigate to emblem health's resource webpage
        driver.navigate().to("https://www.emblemhealth.com/resources");
        //The box should be Displayed.
        Reusable_Actions_Logger.booleanDisplayedByIndex(driver, "//*[@class ='cmp-page-preview-tiles__card-content']", 2, logger,"Forms & Documents Box");

        //The box should say Forms & Documents on top.
        Reusable_Actions_Logger.booleanDisplayedByIndex(driver,"//*[@class ='cmp-page-preview-tiles__card-title']",2,logger,"Forms & Documents Heading");

        //There should be a description underneath the line.
        Reusable_Actions_Logger.booleanDisplayedByIndex(driver,"//*[@class ='cmp-page-preview-tiles__card-description']",2,logger,"Forms & Documents Description");

        //There should be a link box at the bottom of the box.
        Reusable_Actions_Logger.booleanDisplayed(driver,"//*[@data-click_name='go_to_forms_and_documents']",logger,"go to Forms & Documents");
        //get the title of new page
        Reusable_Actions.getTitle(driver);
        //end of logger per test
        reports.endTest(logger);

    }//end of use case 3
    @Test(priority = 4)
    //As a User, I would like to add a your coverage, clarified section as it would be easier to navigate.
    public void coverage(){
        logger=reports.startTest("coverage");
        //navigate to emblem health's resource webpage
        driver.navigate().to("https://www.emblemhealth.com/resources");
        //It should show a photo of 2”x2”
        Reusable_Actions_Logger.booleanDisplayed(driver,"//*[@alt='eh desktop live well']", logger,"photo" );
        //It should say your coverage, clarified next to the photo in capital letters, letters should be in purple color.
        Reusable_Actions_Logger.booleanDisplayed(driver,"//*[text()='YOUR COVERAGE, CLARIFIED']",logger, "Coverage Heading");
        //It should say insurance basics under your coverage, clarified in black color.
        Reusable_Actions_Logger.booleanDisplayed(driver,"//*[text()='Insurance Basics ']",logger,"Insurance Basics");
        //It should have a brief description of section under insurance basics in black color.
        Reusable_Actions_Logger.booleanDisplayed(driver,"//*[@id='body-text-3e49b6275e']",logger,"Description");
        //It should have a learn more link under the description.
        Reusable_Actions_Logger.booleanDisplayedByIndex(driver,"//*[@aria-label='Learn More']", 0, logger,"Learn more Button");
        //The learn more link should be clickable.
        Reusable_Actions_Logger.clickActions(driver,"//*[@aria-label='Learn More']",logger,"Learn More Page");
        //get the title of new page
        Reusable_Actions.getTitle(driver);
        reports.endTest(logger);
    }//end of use case 4
    //As a User, I would like to add a manage billing section as it would be easier to navigate.
    @Test(priority = 5)
    public void manageBilling() throws InterruptedException {
        //start the reports
        logger = reports.startTest("Manage Billing");
        //navigate to emblem health's resource webpage
        driver.navigate().to("https://www.emblemhealth.com/resources");
        //It should show a photo of 2”x2”
        Reusable_Actions_Logger.booleanDisplayed(driver,"//*[@alt= 'eh desktop live well 2']", logger, "manage billing image");
        //It should say manage billing on left side of the photo in capital letters, letters should be in purple color.
        Reusable_Actions_Logger.booleanDisplayed(driver,"//*[text() = 'MANAGE BILLING']", logger, "Manage Billing Heading");
        //It should say Payments & accounts under Manage Billing, clarified in black color.
        Reusable_Actions_Logger.booleanDisplayed(driver, "//*[text() = 'Payments and Accounts ']", logger, "Payments and Accounts");
        //It should have a brief description of section under insurance basics in black color.
        Reusable_Actions_Logger.booleanDisplayed(driver,"//*[@id = 'body-text-c88408b583']", logger,"Description");
        //It should have a View link under the description.
        Reusable_Actions_Logger.booleanDisplayed(driver,"//*[@aria-label = 'View']", logger, "View Button");
        //the button should be clickable and open a new window
        Reusable_Actions_Logger.clickActions(driver,"//*[@aria-label = 'View']",logger,"View Button click test");
        Thread.sleep(6000);
        //switch the tab to the new tab
        Reusable_Actions.tabs(driver,1);
        //get the title of new tab
        Reusable_Actions.getTitle(driver);
        //close the new tab
        driver.close();
        //switch back to original tab
        Reusable_Actions.tabs(driver, 0);
        reports.endTest(logger);
    }//end of use case 5

    //As a User, I would like to add a member newsletter section as it would be easier to navigate.
    @Test(priority = 6)
    public void memberNewsletter(){
        logger = reports.startTest("Member Newsletter");
        //navigate to emblem health's resource webpage
        driver.navigate().to("https://www.emblemhealth.com/resources");
        //It should show a photo of 2”x2”
        Reusable_Actions_Logger.booleanDisplayed(driver, "//*[@alt='HealthMatters 493']", logger, "Newsletter photo");
        //It should say member newsletter on right side of the photo in capital letters, letters should be in purple color.
        Reusable_Actions_Logger.booleanDisplayed(driver, "//*[text() = 'Member Newsletter']", logger, "Title");
        //It should say health matters under the member newsletter in black color.
        Reusable_Actions_Logger.booleanDisplayed(driver, "//*[text() = 'Health Matters ']", logger, "Health Matters Heading");
        //It should have a brief description of section under health matters in black color.
        Reusable_Actions_Logger.booleanDisplayed(driver, "//*[@id= 'body-text-d6a7dd20b1']", logger, "Description");
        //It should have a learn more link under the description.
        Reusable_Actions_Logger.booleanDisplayedByIndex(driver, "//*[@aria-label='Learn More']", 1, logger, "Learn More Button");
        //the learn more button should be click able
        Reusable_Actions_Logger.clickActions(driver,"//*[@href='/resources/member-newsletters']",  logger, "Learn More click Button Test");
        //get the title of new webpage
        Reusable_Actions.getTitle(driver);
        reports.endTest(logger);
    }//end of use case 6

    @AfterSuite
    public void close(){
        driver.quit();
        reports.flush();
    }
}//end of java
