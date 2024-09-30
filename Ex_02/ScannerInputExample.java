import java.util.Scanner;

public class ScannerInputExample 
{
    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
      
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
       
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.println("Name: " + name);     // Display the input values
        System.out.println("Age: " + age);
        
        scanner.close();                         // Close the scanner
     }
}
/*
output
Enter your name: Devendra Ramesh Gurav
Enter your age: 19
Name: Devendra Ramesh Gurav
Age: 19
    */
