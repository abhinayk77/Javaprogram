package Day20;

public class StringHandlingSCP_Heap_Meomory {
    public static void main(String[] args) {
        String S1 ="Abhinay"; //using String literal
        String S2 ="Abhinay"; //using String literal
        System.out.println(S1==S2);//Stores in Scp memory
        System.out.println(S1.equals(S2));
        String S3 = new String("Kumar");//using new keyword
        String S4 = new String("Kumar");
        System.out.println(S3==S4); //Stores in heap
        System.out.println(S3.equals(S4));
    }
}
