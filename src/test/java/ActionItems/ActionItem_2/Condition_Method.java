package ActionItems.ActionItem_2;

public class Condition_Method {
    public static void main(String[] args) {
        //declare grades with numbers
        int grade = 55;
        //print grade A if the grade is greater than 90
        //print grade B if the grade is greater than 80
        //print grade C if the grade is greater than 70
        //print grade D if the grade is greater than 60
        //print grade F if the grade is less than 60
        if (grade >= 90 && grade <= 100){
            System.out.println("Print grade A if the grade is greater than 90");
        }else if (grade >=80 && grade < 90){
            System.out.println("Print grade B if the grade is greater than 80");
        }else if (grade >= 70 && grade < 80){
            System.out.println("Print grade C if the grade is greater than 70");
        }else if (grade >= 60 && grade < 70){
            System.out.println("Print grade D if the grade is greater than 60");
        }else{
            System.out.println("Print grade F if the grade is less than 60");
        }//end of condition
    }//end of main
}//end of java class
