package Day19;

public class StaticMain {
    public static void main(String[] args) {
        StaticExample.incrementCounter();  //call static method
        System.out.println("Counter: " + StaticExample.counter);  //Access static variable
    }
}
