package Day25;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionClass {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(55);
        numbers.add(22);
        numbers.add(88);
        numbers.add(44);
        numbers.add(99);

        // Display original list
        System.out.println("Original List: " + numbers);

        // Sort the list
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);

        // Reverse the list
        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);

        // Find minimum and maximum
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
