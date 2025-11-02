package Day26;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Object> list = new HashSet<>();
        list.add("Apple");
        list.add("150");
        list.add(true);
        list.add(90);
        list.add(3.14f);

        list.add("Mango");
        System.out.println(list);

        list.remove(90);
        System.out.println(list);

        Set<Object> list1 =new HashSet<>();
        list.add(8);list1.add(3);

        Set<Object> list2 = new HashSet<>();
        list2.addAll(list);
        list2.addAll(list1);
        System.out.println(list2);
    }
}
