package Day3;

public class Static_NonStatic {
    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }
    // Non-static (instance) method
    public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }

    public static void main(String[] args) {
        // Calling the static method directly using the class name
        Static_NonStatic.staticMethod();

        // Creating an object to call the non-static method
        Static_NonStatic a = new Static_NonStatic();
        a.nonStaticMethod();
    }
}
