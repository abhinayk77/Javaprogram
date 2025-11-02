package Day21;

public class ReversePalindrome {
    public static void main(String[] args) {
        String str1 = "racecar";
        String reversed = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            reversed += str1.charAt(i);
        }
        System.out.println("Original String : " +str1);
        System.out.println("Reversed String : " + reversed);
        // Check if palindrome
        if (str1.equals(reversed)) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is NOT a Palindrome.");
        }
    }
}
