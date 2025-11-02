package Day23;

public class ExceptionHandaling {
    // Method that throws an exception
    // Method that uses throws to declare an exception
    public static void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            // throw keyword to throw exception manually
            throw new ArithmeticException("Cannot divide by zero");
        }
        System.out.println("Result: " + (a / b));
    }

    public static void main(String[] args) {
        try {
            // try block where exception may occur
            divide(10, 0);  // This will throw an exception
        } catch (ArithmeticException e) {
            // catch block to handle exception
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            // finally block always executes
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues...");
    }

}
