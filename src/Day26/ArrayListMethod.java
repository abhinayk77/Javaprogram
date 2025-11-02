package Day26;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();//Declaration
        //add() and add(index, object)
        list.add("Apple");
        list.add("150");
        list.add(true);
        list.add(3.14f);
        list.add(1,"orange"); // insert at index 1
        //remove() remove(index)
        list.remove("Apple");
        list.remove(2); //remove element of index 2
        //Contain() ,size(),isEmpty()
        System.out.println(list.contains("orange")); //true
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        //get(index) , set(index, object)
        System.out.println(list.get(0));
        list.set(0,"Banana");
        System.out.println(list);

        //Reterival of Data from Arraylist
        //using for loop
        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));

        }
       //USing For each
        for (Object element :list){
            System.out.println(element);
        }
        //using Iterator
        Iterator<Object> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());

        }
    }
}
