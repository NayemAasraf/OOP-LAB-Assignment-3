abstract class Vehicle {
    public abstract void startEngine();
    public abstract void stopEngine();
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine starts (Vroom vroom).");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stops.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine starts (Rumble rumble).");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stops.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();

        System.out.println("--- Car Actions ---");
        myCar.startEngine();
        myCar.stopEngine();

        System.out.println("\n--- Motorcycle Actions ---");
        myMotorcycle.startEngine();
        myMotorcycle.stopEngine();
    }
}