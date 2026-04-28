package java_hw_2;

public class LoopOneToNSum {
    public static void main(String[] args) {
        int n = 15;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum from 1 to " + n + " = " + sum);
    }
}
