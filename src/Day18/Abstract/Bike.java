package Day18.Abstract;

class Bike extends Vehicle
{

    Bike(){
        super(2);
    }
    void start() {System.out.println("Bike starts with Kick");}
    void stop() {System.out.println("Bike stops with handbreaks");}


}
