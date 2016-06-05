/*The difference between do-while and while is that do-while evaluates 
 * its expression at the bottom of the loop instead of the top. 
 * Therefore, the statements within the do block are 
 * always executed at least once, as shown in the following DoWhileDemo program:
*/

public class DoWhile {
    public static void main(String[] args){
        int count = 1;
        do {   //it will execute the job no matter what
            System.out.println("Count for me is: " + count);
            count++;
        } while (count < 11);
    }
}