package Day15;

public class ParamNonParam {
    // Instance variables
    String name;
    int age;

    // Non-parameterized method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Parameterized method
    void setDetails(String studentname, int studentage) {
        name = studentname;
        age = studentage;
    }
}

class PersonTest {
    public static void main(String[] args) {
        // Creating object of Person
        ParamNonParam param = new ParamNonParam();

        // Using parameterized method to set values
        param.setDetails("Abhinay", 32);

        // Using non-parameterized method to display values
        param.displayInfo();
    }
}
