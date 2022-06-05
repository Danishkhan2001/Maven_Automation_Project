package Day3_043022;

public class Multiple_Condition_Statement {
    public static void main(String[] args) {
        //declare 3 integer variable
        int a = 1;
        int b = 2;
        int c = 3;
        //print if a + b is less then c
        //print if a + b is greater then c
        //print if a + b is equal to c
        if (a+b < c){
            System.out.println("a + b is less then c");
        } else if (a+b > c) {
            System.out.println("a + b is greater then c");
        }else{
            System.out.println("a + b is equal to c");
        }//end of multiple conditions
/*
        //declare additional veriables
        int d = 4;
        int e = 5;
        int f = 6;
        // or operator with if statement
        if (d < e && f < e){
            System.out.println("d is less then e or f is less the e");
        }else{
            System.out.println("condition is not true");
        }//end of operator

 */
    }//end of main
}//end of java class
