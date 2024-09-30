
public class Tester {
    public static void main(String[] args) {
        // Sample Input: length = 5.25, breadth = 3.75
        Rectangle rect = new Rectangle(5.25, 3.75);

        // Output: Area and Perimeter
        System.out.println("Area: " + rect.calculateArea());        // Expected Output: Area: 19.69
        System.out.println("Perimeter: " + rect.calculatePerimeter()); // Expected Output: Perimeter: 18.00
    }
}

public class Rectangle {
    // Instance variables
    private double length;
    private double breadth;

    // Constructor to initialize length and breadth
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        double area = length * breadth;
        // Round to two decimal places
        return Math.round(area * 100.0) / 100.0;
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        double perimeter = 2 * (length + breadth);
        // Round to two decimal places
        return Math.round(perimeter * 100.0) / 100.0;
    }
}

