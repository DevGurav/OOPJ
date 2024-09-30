public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int[] numbers = {1, 2, 3};
            System.out.println("Number at index 3: " + numbers[3]); // ArrayIndexOutOfBoundsException
            
            int result = divide(10, 0); // ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds. " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero. " + e.getMessage());
        } catch (Exception e) {
            // Generic exception catch for any other unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Code that will always execute regardless of exceptions
            System.out.println("End of exception handling.");
        }
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b; // This will throw ArithmeticException if b is zero
    }
}
/*
 Output:
 Error: Index out of bounds. Index 3 out of bounds for length 3
End of exception handling.

 */