package Day27;

import java.util.HashSet;
import java.util.Set;

public class DuplicateHashset {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 4, 9, 2, 6, 7};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : numbers) {
            if (!seen.add(num)) {
                duplicates.add(num); // Already in set, so it's a duplicate
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}
