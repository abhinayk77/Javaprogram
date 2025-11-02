package Day27;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateHashSet {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4, 2, 5, 3};

        Set<Integer> seen = new HashSet<>();
        Integer firstDuplicate = null;

        for (int num : arr) {
            if (!seen.add(num)) {
                firstDuplicate = num;
                break;
            }
        }

        if (firstDuplicate != null) {
            System.out.println("First duplicate element: " + firstDuplicate);
        } else {
            System.out.println("No duplicate found");
        }
    }
}
