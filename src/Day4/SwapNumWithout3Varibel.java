package Day4;

public class "SwapNumWithout3Varibel {
    public static void main(String[] args) {
        int a = 5, b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap using addition and subtraction
        a = a + b; // a becomes 15
        b = a - b; // b becomes 5
        a = a - b; // a becomes 10

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
