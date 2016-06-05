/*The while statement evaluates expression, which must return a boolean value. 
 * If the expression evaluates to true, the while statement executes the statement(s) 
 * in the while block. 

*/

public class While {
	public static void main(String[] args) {
		int count = 1;
		while (count < 11) {
			System.out.println("Count for me is: " + count);
			count++;
		}
	}
}