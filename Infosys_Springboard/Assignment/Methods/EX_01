class Calculator {
    // Method to calculate the average of three numbers
    public double findAverage(double num1, double num2, double num3) {
        double sum = num1 + num2 + num3;
        double average = sum / 3;
        
        // Round to two decimal places
        return Math.round(average * 100.0) / 100.0;
    }
}

class Tester {
    public static void main(String args[]) {
        // Create an instance of the Calculator class
        Calculator calculator = new Calculator();
        
        // Invoke the method findAverage of the Calculator class
        double average = calculator.findAverage(65.0, 175.0, 85.0);
        
        // Display the average
        System.out.println("Average of 65.0, 175.0, and 85.0 is: " + average);
        
        // You can add more test cases here
        double avg2 = calculator.findAverage(10.0, 20.0, 30.0);
        System.out.println("Average of 10.0, 20.0, and 30.0 is: " + avg2);
    }
}
