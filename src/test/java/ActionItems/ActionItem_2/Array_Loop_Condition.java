package ActionItems.ActionItem_2;

import java.util.ArrayList;

public class Array_Loop_Condition {
    //create an Array with cities and print only when the city is Brooklyn or Manhattan
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Bronx");
        cities.add("Manhattan");
        cities.add("Staten Island");
        cities.add("Long Island");
        for (int i = 0; i < cities.size(); i++){
            //print Brooklyn & Manhattan with if condition
            if (cities.get(i) == "Brooklyn"){
                System.out.println("My First city is " + cities.get(i));
            }else if (cities.get(i) == "Manhattan"){
                System.out.println("My Second city is " + cities.get(i));
            }//end of if condition
        }//end of for loop
    }//end of main
}//end of java Class
