package Day3_043022;

import Reuseable_liberaries.ReuseableMethod;

public class TestingMethod {
    //call the reuseable method addTwoNumbers and execute it
    public static void main(String[] args) {
       /* ReuseableMethod.addTwoNumbers(20,30);
    */
    //call the subtract two numbers method and execute it
        int i = ReuseableMethod.subtractTwoNumbers(30,20);
        int newResult = i + 10;
        System.out.println("new result is " + newResult);


}//end of main
}//end of java
