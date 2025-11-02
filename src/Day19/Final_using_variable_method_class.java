package Day19;

final class Vehicle  {
    // Final Class - cannot be extended

        // Final Variable - value cannot be changed once assigned
        final int maxSpeed;

           Vehicle(int value)     //constructor
           {
               maxSpeed=value;
           }
        // Final Method - cannot be overridden
        final void displaySpeed() {
            System.out.println("Max speed is: " + maxSpeed + " km/h");
        }
    }

// Attempting to extend this class will cause an error
// class Car extends Vehicle {}  //  This will throw an error

    public class Final_using_variable_method_class {
        public static void main(String[] args) {
            Vehicle vehicle = new Vehicle(120);
            vehicle.displaySpeed();

            // Final variable example
            final int wheels = 4;
            System.out.println("Number of wheels: " + wheels);

        }
    }


