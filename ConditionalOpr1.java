//The Conditional Operators
//
//The && and || operators perform Conditional-AND and Conditional-OR operations on two boolean expressions. 
//These operators exhibit "short-circuiting" behavior,
//which means that the second operand is evaluated only if needed.
//
//&& Conditional-AND
//|| Conditional-OR
//The following program, ConditionalDemo1, tests these operators:


 public class ConditionalOpr1{

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        if((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2");
        if((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");
    }
}
