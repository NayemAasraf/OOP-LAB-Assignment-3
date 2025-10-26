interface Flyable {
    void fly_obj();
}

class Spacecraft implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Spacecraft is flying in space.");
    }
}

class Airplane implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Airplane is flying at high altitude.");
    }
}

class Helicopter implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Helicopter is hovering.");
    }
}

public class Main {
    public static void main(String[] args) {
        Flyable craft = new Spacecraft();
        Flyable plane = new Airplane();
        Flyable heli = new Helicopter();

        craft.fly_obj();
        plane.fly_obj();
        heli.fly_obj();
    }
}