package Day15;

public class StaticNonStatic {
    // Static method
    static void welcome() {
        System.out.println("Welcome to Abhinay!");
    }

    // Non-static method
    void Display() {
        System.out.println("This is automation course class");
    }
}

class MethodDemo {
    public static void main(String[] args) {
        // Calling static method (no object needed)
        StaticNonStatic.welcome();

        // Creating object to call non-static method
        StaticNonStatic ab = new StaticNonStatic();
        ab.Display();
    }
}
