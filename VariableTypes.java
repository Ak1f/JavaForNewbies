
//we are learning variable types, primitive data type

public class VariableTypes { // class names are always capital
	public static void main(String[] args) { // main part is needed for the
												// program to work

		// int a, b, c; // Declares three ints, a, b, and c.
		int a = 10, b = 10; // Example of initialization
		byte B = 22; // initializes a byte type variable B.
		double pi = 3.14159; // declares and assigns a value of PI.
		float Pi_num = 3.14F; // always replace "F" at the end.
		char chr = 'a'; // the char variable chr is initialized with value 'a' only single quote
		double large = 1.3e100;     // using the exponent notation

		short x = 9870; // a short is twice the size of a byte,
		long l = 6778005876543l; // always remember to replace "l" at the end of
									// the numbers.

		boolean blo = true;

		String str = "hello this is a String type"; // String is always Capital

		System.out.println("This is an integer: " + a);
		System.out.println("This is a byte: " + B);
		System.out.println("This is a double: " + pi);
		System.out.println("This is a char: " + chr);
		System.out.println("This is a String: " + str);
		System.out.println("This is a float num: " + Pi_num);
		System.out.println("This is a large double : " + large);

		System.out.println("This is a short number: " + x);
		System.out.println("This is a long number: " + l);
		System.out.println("This is a boolean (default value is false): " + blo);

	}

}
