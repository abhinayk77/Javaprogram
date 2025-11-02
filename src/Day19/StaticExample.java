package Day19;

public class StaticExample {
    static int counter;  //static variable

    static   //static block
    {
        counter = 100;
        System.out.println("Static Block executed " + counter);
    }
    static void incrementCounter()      //static method
    {
        counter++;
        System.out.println("Counter Incremented: " + counter );
    }

}
