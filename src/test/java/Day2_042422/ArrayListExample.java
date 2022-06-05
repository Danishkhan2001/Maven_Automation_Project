package Day2_042422;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //create an Arraylist for countries
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Pakistan");
        countries.add("USA");
        countries.add("Bangladesh");
        countries.add("Canada");
        countries.add("India");

        //I want to print 4th value from the list
        System.out.println("My fourth country is " + countries.get(3) + " and my third country is " + countries.get(2));

    }//end of main
}//end of class
