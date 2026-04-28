package java_hw_4.task2;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(12345, "Viktorija Artimovich", 2000.15);

        double balanceAfterAdding = account1.addToBalance(500);
        System.out.println("New balance after adding = " + balanceAfterAdding) ;

        double balanceAfterWithdraw = account1.withdrawFromBalance(200);
        System.out.println("New balance after withdraw = " + balanceAfterWithdraw);
    }

}
