//The following program, ConditionalDemo2,
// tests the ternary "?:" operator:

/*Another conditional operator is "?:"  
 which can be thought of as shorthand for an 
 if-then-else statement 
 (discussed in the Control Flow Statements section of this lesson). 
 
This operator is also known as the ternary operator
because it uses three operands. In the following example, 
this operator should be read as: "If someCondition is true,"
+ " assign the value of value1 to result. "
+ "Otherwise, assign the value of value2 to result."
*/

public class Conditional2Ternary {

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        int result;
        boolean aCondition = true;
        
        result = aCondition ? value1 : value2;  //if-then-else statement 

        System.out.println(result);
    }
}