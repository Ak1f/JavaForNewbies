class Person {
    
    // Instance variables (data or "state")
    String name;
    int age;
    
    
    // Classes can contain
    
    // 1. Data
    // 2. Subroutines (methods)
}
//The second class which prints, you can use Bluj for a simple start.

public class App {

    public static void main(String[] args) {
        
        
        // Create a Person object using the Person class
        Person person1 = new Person();    
        person1.name = "Akif Khan";
        person1.age = 30;
        
        // Create a second Person object
        Person person2 = new Person();
        person2.name = "Jane Smith";
        person2.age = 24;
        
        System.out.println(person1.name+" "+person1.age);
        System.out.println(person2.name+" "+person2.age);
        
    }

}
