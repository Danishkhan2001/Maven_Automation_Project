package Day4_050722;

public class SplitMessage {
    public static void main(String[] args) {
        //declare string variable
        String splitMessage = "My Name Is John";
        //declare an array of string to store the string split
        String[] splitMessageArray = splitMessage.split("I");

        //print out john to console
        System.out.println("My first name is " + splitMessageArray[0]);
    }//end of main
}//end of class
