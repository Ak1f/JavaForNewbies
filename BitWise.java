/*The bitwise & operator performs a bitwise AND operation.

The bitwise ^ operator performs a bitwise exclusive OR operation.

The bitwise | operator performs a bitwise inclusive OR operation.

The following program, BitDemo, uses the bitwise AND operator to print the number "2" to standard output.*/


public class BitWise {
    public static void main(String[] args) {
        int bitask = 0x000F;
        int value = 0x2222;
        // prints "2"
        System.out.println(value & bitask);
    }
}