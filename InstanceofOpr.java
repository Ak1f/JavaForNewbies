/*The Type Comparison Operator instanceof operator compares an object to a specified type. 
You can use it to test if an object is an instance of a class, 
an instance of a subclass, or an instance of a class that implements 
a particular interface.

The following program, InstanceofDemo, defines a parent class (named Parent),
 a simple interface (named MyInterface), and a child class (named Child) 
 that inherits from the parent and implements the interface.
*/

public class InstanceofOpr {
    public static void main(String[] args) {

        Parent object1 = new Parent();
        Parent object2 = new Child();

        System.out.println("object1 instanceof Parent: "
            + (object1 instanceof Parent));
        System.out.println("object1 instanceof Child: "
            + (object1 instanceof Child));
        System.out.println("object1 instanceof MyInterface: "
            + (object1 instanceof MyInterface));
        System.out.println("object2 instanceof Parent: "
            + (object2 instanceof Parent));
        System.out.println("object2 instanceof Child: "
            + (object2 instanceof Child));
        System.out.println("object2 instanceof MyInterface: "
            + (object2 instanceof MyInterface));
    }
}

class Parent {}
class Child extends Parent implements MyInterface {}
interface MyInterface {}