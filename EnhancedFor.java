//The following program, EnhancedForDemo, 


public class EnhancedFor {
    public static void main(String[] args){
         int[] numbers = 
             {1,2,3,4,5,6,7,8,9,10};
         for (int item : numbers) { //uses the enhanced for to loop through the array:
             System.out.println("Count for me is: " + item);
         }
    }
}