//To make the state of the managed bean accessible, you need to add setter and getter methods
//for that state. The createSalutation method calls the bean’s greet method, 
//and the getSalutation method retrieves the result.



public class PersonSetter {
    String name;
    int age;
    
    void speak() {
        System.out.println("My name is: " + name);
    }
    
    int calculateYearsToRetirement() {
        int yearsLeft = 65 - age;
        
        return yearsLeft;
    }
    
    int getAge() {
        return age;
    }
    
    String getName() {
        return name;
    }
}




//The second class
public class AppGetter {

    public static void main(String[] args) {
    	PersonSetter person1 = new PersonSetter();
        
        person1.name = "Akif";
        person1.age = 30;
        
        // person1.speak();
        
        int years = person1.calculateYearsToRetirement();
        
        System.out.println("Years till retirements " + years);
        
        int age = person1.getAge();
        String name = person1.getName();
        
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }

}
