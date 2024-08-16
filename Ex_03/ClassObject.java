class Person 
    {
      String name;
      int age;

       Person(String name, int age) 
       {
         this.name = name;
         this.age = age;
       }

       // Method to display the person's details
      void displayInfo() 
       {
         System.out.println("Name: " + name);
         System.out.println("Age: " + age);
       }
    }

class ClassObject 
 {
    public static void main(String[] args) 
     {
        // Create a Person object
        Person person1 = new Person("Alice", 25);

        // Call the method to display the person's details
        person1.displayInfo();
     }
 }
