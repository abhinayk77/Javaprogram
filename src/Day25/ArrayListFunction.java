package Day25;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListFunction {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        //add() function
        coll.add("Apple");
        coll.add("Orange");
        coll.add("mango");
        System.out.println(coll);

        // addAll() function
        Collection<String> coll1 = new ArrayList<>();
        coll1.add("Banana");
        coll1.addAll(coll);
        System.out.println(coll1);

        //remove function
        coll.remove("Orange");
        System.out.println(coll);

        //removeall function
        coll1.removeAll(coll);
        System.out.println(coll1);
        //contain() function
        System.out.println(coll.contains("Apple"));
        System.out.println(coll.contains("Banana"));

        // size() function

        System.out.println(coll.size());
    }
}
