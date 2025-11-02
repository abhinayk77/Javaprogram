package Day21;

public class CharBubbleSort {
    public static void main(String[] args) {
        String input = "dacbe";
        char[] chars = input.toCharArray();

        // Bubble Sort using compareTo()
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = 0; j < chars.length - i - 1; j++) {
                // Compare ASCII values using compareTo
                if (Character.toString(chars[j]).compareTo(Character.toString(chars[j + 1])) > 0) {
                    // Swap characters
                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted characters: " + new String(chars));
    }
    }

