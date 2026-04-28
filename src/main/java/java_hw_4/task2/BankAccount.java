package java_hw_4.task2;

public class BankAccount {

    private int accountID;
    private String ownerName;
    private double balance;

    public BankAccount(int cardID, String ownerName, double balance) {
        this.accountID = cardID;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public int getAccountID() {
        return this.accountID;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public double getBalance() {
        return this.balance;
    }

    public double addToBalance(double amount) {
        balance = balance + amount;
        return balance;
    }

    public double withdrawFromBalance(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Not enough money on balance");
        }
        return balance;
    }
}
