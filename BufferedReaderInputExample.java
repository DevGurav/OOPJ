import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderInputExample 
{
    public static void main(String[] args) 
     {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            
             System.out.print("Enter your name: ");
             String name = reader.readLine();
            
             System.out.print("Enter your age: ");
             int age = Integer.parseInt(reader.readLine());
            
             System.out.println("Name: " + name);
             System.out.println("Age: " + age);
            }
       catch (IOException e) 
            {
             System.out.println("An error occurred while reading input.");
             e.printStackTrace();
            }
    }
}
