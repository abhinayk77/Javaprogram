package Day6;

public class PalidromWithFunction {
    public static boolean isPalidrome(int num)
    {
        int org =num, reverse = 0;
        while (num != 0)
        {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        return org == reverse;
    }

    public static void main(String[] args) {
        int num = 121;
        if (isPalidrome(num)) {
            System.out.println(num + " is a Palindrome number.");
        } else {
            System.out.println(num + " is NOT a Palindrome number.");
        }
    }
}
