package Day2_042422;

import java.util.ArrayList;

public class ForLoop {
    public static void main(String[] args) {
        // create an arraylist for cities and loop/iterating through all the values using a for loop
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Bronx");
        cities.add("Long Island");
        cities.add("Staten Island");

        for (int i = 0; i < cities.size(); i++){
            System.out.println("i is now " + i);
            System.out.println("My city is " + cities.get(i));
        }//end of loop
    }//end of main
}//end of java class
