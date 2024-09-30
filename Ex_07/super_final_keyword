// Parent class
class Animal {
    // Final method (cannot be overridden)
    public final void sound() {
        System.out.println("Animals make sound.");
    }
    
    // Non-final method (can be overridden)
    public void eat() {
        System.out.println("Animals eat food.");
    }
}

// Child class (Dog inherits from Animal)
class Dog extends Animal {
    
    // Overriding the eat() method of parent class
    @Override
    public void eat() {
        super.eat();  // Calling the parent class's eat() method using 'super'
        System.out.println("Dog eats bones.");
    }
    
    // Trying to override sound() will cause an error because it's final
    // public void sound() {
    //     System.out.println("Dog barks.");  // This would cause a compilation error
    // }
}

// Final class (cannot be extended)
final class Cat extends Animal {
    
    // Method specific to Cat class
    public void purr() {
        System.out.println("Cat purrs.");
    }
}

// This will cause an error because Cat is a final class
// class Kitten extends Cat {}

public class SuperAndFinalDemo {
    public static void main(String[] args) {
        // Create a Dog object
        Dog dog = new Dog();
        dog.eat(); // Calls overridden method
        dog.sound(); // Calls final method from parent class
        
        // Create a Cat object
        Cat cat = new Cat();
        cat.eat(); // Inherits eat() from Animal
        cat.purr(); // Calls method specific to Cat
    }
}
