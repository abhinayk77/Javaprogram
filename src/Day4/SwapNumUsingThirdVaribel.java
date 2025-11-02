package Day4;

public class SwapNumUsingThirdVaribel {
    public static void main(String[] args) {
        int num1 = 10; // First number
        int num2 = 20; // Second number

        System.out.println("Before swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


        // Swapping using a third variable
        int temp = num1; // Store num1 in temp
        num1 = num2;     // Assign num2 to num1
        num2 = temp;     // Assign temp (original num1) to num2

        System.out.println("After swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
