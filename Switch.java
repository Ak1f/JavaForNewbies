import java.util.Scanner;

/*The following code example, SwitchDemo, declares an int named 
 * month whose value represents a month. The code displays the
 *  name of the month, based on the value of month, using the switch statement.
*/

public class Switch {
	public static void main(String[] args) {

		Scanner inputFromUser = new Scanner(System.in); // this is how we get
														// input from user

		System.out.println("Please enter a number between 1-12 : "); // print

		int month = inputFromUser.nextInt(); // to declare data type

		String monthString;
		switch (month) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
			break;
		case 5:
			monthString = "May";
			break;
		case 6:
			monthString = "June";
			break;
		case 7:
			monthString = "July";
			break;
		case 8:
			monthString = "August";
			break;
		case 9:
			monthString = "September";
			break;
		case 10:
			monthString = "October";
			break;
		case 11:
			monthString = "November";
			break;
		case 12:
			monthString = "December";
			break;
		default:
			monthString = "Invalid month";
			break;
		}
		// System.out.println(monthString);
		System.out.println("The number you entered is :" + month + "\nThe month is " + monthString);
		// to break the line use \n

	}
}