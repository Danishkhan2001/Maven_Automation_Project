package ActionItems.ActionItem_1;

public class WhileLoopLinearArray {
    public static void main(String[] args) {

        //iterate through region and their area codes using whileLoop and LinearArray
        String[] region = new String[]{"Nassau", "Suffolk", "Queens", "Brooklyn"};
        int[] areaCodes = new int[]{516,631,718,347};

        //initialize the starting point before calling a whileLoop
        int i = 0;
        //define the end point in whileLoop
        while (i < areaCodes.length){
            System.out.println("My list of region is " + region[i] + " their area codes are " + areaCodes[i]);

            //incrementing
            i = i +1;
        }//end of whileLoop
    }//end of main
}//end of java class
