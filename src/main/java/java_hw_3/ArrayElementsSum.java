package java_hw_3;

public class ArrayElementsSum {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {1, 2, 3};
        int sum = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            sum = sum + arrayOfNumbers[i];
        }
        System.out.println(sum);
    }
}
