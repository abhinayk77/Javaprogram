package Day18.Abstract;

class Car extends Vehicle
{
    Car()
    {
        super(4);
    }
    void start() {System.out.println("Car starts with key ignition");}
    void stop() {System.out.println("Car stops with breaks");}
}