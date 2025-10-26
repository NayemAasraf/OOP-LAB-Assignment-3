abstract class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited to Savings: " + amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew from Savings: " + amount);
        } else {
            System.out.println("Savings withdrawal failed: Insufficient funds.");
        }
    }
}

class CurrentAccount extends BankAccount {

    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited to Current: " + amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew from Current: " + amount);
        } else {
            System.out.println("Current withdrawal failed: Insufficient funds.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(1000.0);
        BankAccount current = new CurrentAccount(5000.0);

        System.out.println("Initial Savings Balance: " + savings.getBalance());
        System.out.println("Initial Current Balance: " + current.getBalance());

        System.out.println("\n--- Savings Transactions ---");
        savings.deposit(500.0);
        savings.withdraw(200.0);
        savings.withdraw(1500.0); 

        System.out.println("\n--- Current Transactions ---");
        current.deposit(1000.0);
        current.withdraw(3000.0);
        current.withdraw(4000.0); 

        System.out.println("\n--- Final Balances ---");
        System.out.println("Final Savings Balance: " + savings.getBalance());
        System.out.println("Final Current Balance: " + current.getBalance());
    }
}