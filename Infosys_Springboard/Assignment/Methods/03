class Calculator {
    // Instance variable
    private int num;
    
    // Constructor to initialize num
    public Calculator(int num) {
        this.num = num;
    }
    
    // Method to calculate the sum of digits of num
    public int sumOfDigits() {
        int sum = 0;
        int temp = num;  // Temporary variable to hold the value of num
        
        // Loop to extract digits and calculate the sum
        while (temp > 0) {
            int digit = temp % 10;  // Get the last digit
            sum += digit;           // Add the digit to sum
            temp /= 10;             // Remove the last digit
        }
        
        return sum;
    }
}

class Tester {
    public static void main(String[] args) {
        // Create an object of Calculator class and initialize num
        Calculator calculator = new Calculator(12345);
        
        // Invoke the sumOfDigits() method and display the result
        int sum = calculator.sumOfDigits();
        System.out.println("Sum of digits: " + sum);
        
        // Additional test cases can be added here
        Calculator calculator2 = new Calculator(9876);
        System.out.println("Sum of digits: " + calculator2.sumOfDigits());
    }
}
