package Day3_043022;

import java.util.ArrayList;

public class Loop_With_Condition {
    public static void main(String[] args) {
        //create an array with fruits and print only when fruits is apple or orange
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Strawberry");
        fruits.add("Pineapple");
        for ( int i = 0; i < fruits.size(); i++){
            //with if condition

            if (fruits.get(i) == "Apple"){
                System.out.println("My fruit is " + fruits.get(i));
            }else if (fruits.get(i) == "Orange"){
                System.out.println("My fruit is " + fruits.get(i));

            }//end of condition
            //print is with or operator
            if (fruits.get(i) == "Apple" || fruits.get(i) == "Orange"){
                System.out.println("My fruit is " + fruits.get(i));
            }
        }//end of loop
    }//end of main
}//end of java
