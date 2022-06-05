package ActionItems.ActionItem_1;

import java.util.ArrayList;

public class ForLoopArrayList {

    public static void main(String[] args) {

        //create an array list for countries
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Pakistan");
        countries.add("Saudi Arabia");
        countries.add("Switzerland");
        countries.add("Turkey");

        //declare country codes as int
        ArrayList<Integer> countryCodes = new ArrayList<>();
        countryCodes.add(+92);
        countryCodes.add(+966);
        countryCodes.add(+41);
        countryCodes.add(+90);

        //declare a for loop of countries and their country codes
        for (int i = 0; i < countries.size(); i++){

            //print the countries with their country codes
            System.out.println("My list to visit the countries is " + countries.get(i) + " with their country codes " + countryCodes.get(i));


        }//end of for loop
    }//end of main
}//end of java class

