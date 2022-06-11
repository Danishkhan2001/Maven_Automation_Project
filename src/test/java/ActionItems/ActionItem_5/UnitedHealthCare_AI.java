package ActionItems.ActionItem_5;


import Reuseable_liberaries.Reusable_Actions;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class UnitedHealthCare_AI {
    public static void main(String[] args) {
        //create an ArrayList for First name
        ArrayList<String> firstName = new ArrayList<>();
        firstName.add("Danish");
        firstName.add("John");
        firstName.add("James");

        //create an ArrayList for last name
        ArrayList<String> lastName = new ArrayList<>();
        lastName.add("Khan");
        lastName.add("Doe");
        lastName.add("Bond");

        //create an ArrayList for birth month
        ArrayList<String> month = new ArrayList<>();
        month.add("November");
        month.add("June");
        month.add("July");

        //create an ArrayList for birthday
        ArrayList<String> day = new ArrayList<>();
        day.add("29");
        day.add("05");
        day.add("15");

        //create an ArrayList for birth year
        ArrayList<String> year = new ArrayList<>();
        year.add("1990");
        year.add("1985");
        year.add("1996");

        //create an ArrayList for zipcode
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11356");
        zipCode.add("11580");
        zipCode.add("11426");

        //create an ArrayList for member id
        ArrayList<String> memberId = new ArrayList<>();
        memberId.add("123456");
        memberId.add("789123");
        memberId.add("456789");

        //set up the browser using reusable method
        WebDriver driver = Reusable_Actions.driver();

        for (int i = 0; i < firstName.size(); i++) {
            //navigate to uhc.com
            driver.navigate().to("https://www.uhc.com");

            //get the title of web page
            Reusable_Actions.getTitle(driver);

            //click on find a doctor using reusable method
            Reusable_Actions.clickActions(driver, "//*[@aria-label='Find a doctor']", "Find a Doctor");

            //click on sign in using reusable method
            Reusable_Actions.clickActions(driver, "//*[@class='mr-4']", "Sign in");

            //click on medicare plan using reusable method
            Reusable_Actions.clickByIndexAction(driver, "//*[@class='signin__link weight-bold display-block px-5 py-2']", 1, "Medicare Plan");

            //switch to new tab
            Reusable_Actions.tabs(driver, 1);

            //click on register now
            Reusable_Actions.clickActions(driver, "//*[@class='uhc-tempo-link uhc-tempo-link--medium registerBtn ng-scope']", "Register Now");

            //use the arraylist to fill the first name field
            Reusable_Actions.sendKeysActions(driver, "//*[@id='firstName']", firstName.get(i), "first name");

            //use an arrayList to fill the last name field
            Reusable_Actions.sendKeysActions(driver,"//*[@id='lastName']", lastName.get(i), "last name");

            //use an arrayList to select the birth month
            Reusable_Actions.selectByText(driver,"//*[@id='dob_month_input']", month.get(i), "month");

            //use an arrayList to fill day field
            Reusable_Actions.sendKeysActions(driver,"//*[@id='dob_day']", day.get(i), "birth day");

            //use an arrayList to fill year field
            Reusable_Actions.sendKeysActions(driver,"//*[@id='dob_year']", year.get(i),"birth year");

            //use an arrayList to fill zipcode field
            Reusable_Actions.sendKeysActions(driver, "//*[@id='zipCode']",zipCode.get(i), "zipcode");

            //use an arrayList to fill member id
            Reusable_Actions.sendKeysActions(driver,"//*[@id='memberId']", memberId.get(i), "member id");

            //click on continue use a reusable method
            Reusable_Actions.clickActions(driver,"//*[@id='submitBtn']","continue button");

            //capture the error by using a reusable method
            String errorMessage = Reusable_Actions.getTextActions(driver,"//*[@id='plainText_error']", "Error Message");
            System.out.println("My error message is " + errorMessage);

            //close the tab
            driver.close();

            //switch back to original tab
            Reusable_Actions.tabs(driver, 0);
        }//end of for loop

        //quit the browser
        driver.quit();
    }//end of main
}//end of java
