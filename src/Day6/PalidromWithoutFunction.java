package Day6;

public class PalidromWithoutFunction {
    public static void main(String[] args) {
int num = 121;
int org = num;
int reverse = 0;
while (num != 0)
{
    int digit = num % 10;
    reverse = reverse * 10 + digit;
    num = num / 10;
}
        if (org == reverse) {
            System.out.println(org + " is a Palindrome number.");
        } else {
            System.out.println(org + " is NOT a Palindrome number.");
        }

    }
}
