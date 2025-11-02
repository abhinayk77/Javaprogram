package Day27;

import java.util.HashMap;

public class DuplicateHashMap {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 1, 2, 4, 6};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            if (map.containsKey(num)) {
                System.out.println("Duplicate found: " + num);
            } else {
                map.put(num, 1);
            }
        }
    }
}
