package Day18.Interface;
public class InterfaceDemo {

    public static void main(String[] args)
    {
        Vehical Car = new Car();
        Vehical Bike = new Bike();
        System.out.println("Car tires: " + Car.tires());
        Car.start();
        Car.stop();
        System.out.println("Bike tires: " + Bike.tires());
        Bike.start();
        Bike.stop();
    }

}