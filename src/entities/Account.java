package entities;

public class Account {
     private int number;
     private String holder;
     private double balance;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }
    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        addDeposit(initialDeposit);
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public double getBalance() {
        return balance;
    }
    public String toString() {
        return "Account "
                + getNumber()+", Holder: "
                + getHolder()+", Balance: $"
                + String.format("%.2f", getBalance());
    }
    public void addDeposit (double amount) {
        balance+= amount;
    }
    public void removeDeposit (double amount) {
        balance-= amount + 5.00;
    }
}

