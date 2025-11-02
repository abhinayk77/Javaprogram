package Day18.Abstract;

abstract class Vehicle

{
    int tires;
    Vehicle(int tires)
    {
        this.tires = tires;
    }
    abstract void start();   //Abstract method 1
    abstract void stop(); //Abstract method 2
    void displayTires()
    {
        System.out.println("Number of tires: " + tires);
    }
}