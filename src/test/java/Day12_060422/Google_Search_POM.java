package Day12_060422;

import PageObject.BaseClass;
import ReusableClasses.Reusable_Annotations_Class;
import org.testng.annotations.Test;

public class Google_Search_POM extends Reusable_Annotations_Class {



    @Test
    public void SearchForKeywordsOnGoogle(){
        driver.navigate().to("https://www.google.com");
        BaseClass.googleHomePage().searchUserValue("BMW");
        BaseClass.googleHomePage().submitSearch();
    }//end of first test

    @Test(dependsOnMethods = "SearchForKeywordsOnGoogle")
    public void captureResultOnGoogleSearch(){
       BaseClass.googleSearchResultPage().captureSearchResultAndPrintIt();
    }//end of first test
}//end of class
