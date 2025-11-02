package Day18.Abstract;

public class DemoVehical
{

    public static void main(String[] args)
    {
        Vehicle car = new Car();
        Vehicle Bike = new Bike();
        car.displayTires();
        car.stop();
        car.start();
        Bike.displayTires();
        Bike.start();
        Bike.stop();

    }

}