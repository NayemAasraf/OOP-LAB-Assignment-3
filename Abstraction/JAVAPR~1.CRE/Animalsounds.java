abstract class Animal {
    public abstract void sound();
}

class Lion extends Animal {
    @Override
    public void sound() {
        System.out.println("Lion roars");
    }
}

class Tiger extends Animal {
    @Override
    public void sound() {
        System.out.println("Tiger growls");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myLion = new Lion();
        Animal myTiger = new Tiger();

        myLion.sound();
        myTiger.sound();
    }
}