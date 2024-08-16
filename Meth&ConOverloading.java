class Calculator 
{
    double number1;
    double number2;

    // Constructor 1: No parameters (default values)
    Calculator() 
    {
        this.number1 = 0;
        this.number2 = 0;
    }

    // Constructor 2: One parameter
    Calculator(double number) 
    {
        this.number1 = number;
        this.number2 = 0;
    }

    // Constructor 3: Two parameters
    Calculator(double number1, double number2) 
    {
        this.number1 = number1;
        this.number2 = number2;
    }

    // Method 1: Addition (no parameters)
    double add() 
    {
        return number1 + number2;
    }

    // Method 2: Addition (two parameters)
    double add(double a, double b) 
    {
        return a + b;
    }

    // Method 3: Multiplication (no parameters)
    double multiply() 
    {
        return number1 * number2;
    }

    // Method 4: Multiplication (two parameters)
    double multiply(double a, double b) 
    {
        return a * b;
    }
}

class Meth&ConOverloading
{
    public static void main(String[] args) 
    {
        // Using the first constructor (no parameters) default constructor
        Calculator calc1 = new Calculator();
        System.out.println("Addition (no parameters): " + calc1.add());
        System.out.println("Multiplication (no parameters): " + calc1.multiply());

        // Using the second constructor (one parameter)
        Calculator calc2 = new Calculator(10);
        System.out.println("Addition (one parameter): " + calc2.add());
        System.out.println("Multiplication (one parameter): " + calc2.multiply());

        // Using the third constructor (two parameters)
        Calculator calc3 = new Calculator(10, 20);
        System.out.println("Addition (two parameters): " + calc3.add());
        System.out.println("Multiplication (two parameters): " + calc3.multiply());

        // Using overloaded methods directly
        System.out.println("Addition (direct method call): " + calc3.add(5, 15));
        System.out.println("Multiplication (direct method call): " + calc3.multiply(5, 15));
    }
}
