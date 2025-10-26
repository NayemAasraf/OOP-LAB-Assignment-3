abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();
    public abstract void displayInfo();
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Manager ---");
        System.out.println("Name: " + name);
        System.out.println("Role: Manager");
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class Programmer extends Employee {
    private double overtimePay;

    public Programmer(String name, double baseSalary, double overtimePay) {
        super(name, baseSalary);
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + overtimePay;
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Programmer ---");
        System.out.println("Name: " + name);
        System.out.println("Role: Programmer");
        System.out.println("Total Salary: " + calculateSalary());
    }
}

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice Smith", 90000.0, 20000.0);
        Employee programmer = new Programmer("Bob Johnson", 75000.0, 10000.0);

        manager.displayInfo();
        System.out.println(); 
        programmer.displayInfo();
    }
}