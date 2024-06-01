// Hybrid inheritance using a combination of Hierarchical and Multiple Inheritance
interface Engine{
    void startEngine();
}

class Vehicle{
    void move(){
        System.out.println("Moving...");
    }
}

class car extends Vehicle implements Engine{
    @Override
    public void startEngine() {
        System.out.println("Car engine is started...");
    }

    void drive(){
        System.out.println("Driving a car...");
    }
}

class bike extends Vehicle implements Engine{
    @Override
    public void startEngine() {
        System.out.println("Bike engine is started...");
    }

    void ride(){
        System.out.println("Riding a bike...");
    }
}

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        car cr = new car();
        cr.startEngine();
        cr.drive();
        cr.move();

        bike bk = new bike();
        bk.startEngine();
        bk.ride();
        bk.move();
    }
}
