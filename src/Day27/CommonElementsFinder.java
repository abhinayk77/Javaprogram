package Day27;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonElementsFinder {
    public static void main(String[] args) {
        // Create ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("green");

        // Create HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("blue", 10);
        map.put("yellow", 20);
        map.put("red", 30);

        // Check common elements
        for (String item : list) {
            if (map.containsKey(item)) {
                System.out.println("Common element: " + item);
            }
        }
    }
}
