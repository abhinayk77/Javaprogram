package Day15;

public class ReturnNonReturn {
    // Non-return type method (void)
    void printWelcome() {
        System.out.println("This is Calculator!");
    }

    // Return type method (int)
    int multiNumbers(int num1, int num2) {
        int multi = num1 * num2;
        return multi;
    }
}

class Print {
    public static void main(String[] args) {
        // Create object of Calculator
        ReturnNonReturn calc = new ReturnNonReturn();

        // Call non-return type method
        calc.printWelcome();

        // Call return type method
        int result = calc.multiNumbers(10, 20);
        System.out.println("Multiplication is: " + result);
    }
}
