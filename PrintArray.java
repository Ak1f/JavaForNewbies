// we are learning arrays now.

public class PrintArray {
	public static void main(String[] args) {

		/*
		 * Examples of array declarations: String[] args; // single-dimensional
		 * array of String objects int[] numbers; // single-dimensional array of
		 * ints byte[] buffer; // single-dimensional array of bytes short[][]
		 * shorts; // double-dimensional array of shorts to get the array
		 * length: int arrayLength = myNums.length; // 5 int nameLength =
		 * name.length; // 3 int bufLength = buf[2].length; // 1024
		 */

		// declares an array of integers

		int[] A;

		// allocates memory for 5 integers
		A = new int[5];

		// initialize elements
		A[0] = 15;// first element

		A[1] = 20;// second element

		A[2] = 25;// third element

		A[3] = 30;// fourth element

		A[4] = 50;// fifth element

		System.out.println("Element at index 0: " + A[0]);
		System.out.println("Element at index 1: " + A[1]);
		System.out.println("Element at index 2: " + A[2]);
		System.out.println("Element at index 3: " + A[3]);
		System.out.println("Element at index 4: " + A[4]);

	}
}