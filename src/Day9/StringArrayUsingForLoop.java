package Day9;

public class StringArrayUsingForLoop {
    public static void main(String[] args) {
        // Create an array of strings
        String[] Name = {"Abhinay", "Shankar", "Ashish", "Rahul", "Vishal"};

        System.out.println("List of Name:");

        // Retrieve and print using for loop
        for (int i = 0; i < Name.length; i++) {
            System.out.println(Name[i]);
        }
    }
}
