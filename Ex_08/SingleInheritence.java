// Parent class
class Animal {
    // Method in the parent class
    public void sound() {
        System.out.println("Animals make sound.");
    }
}

// Child class (inherits from Animal)
class Dog extends Animal {
    // Method in the child class
    public void bark() {
        System.out.println("Dog barks.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog dog = new Dog();
        
        // Call methods from both the parent class and child class
        dog.sound();  // Calling method from the parent class (Animal)
        dog.bark();   // Calling method from the child class (Dog)
    }
}
