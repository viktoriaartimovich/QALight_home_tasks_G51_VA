package java_hw_3;

public class ArrayEvenElementsCount {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {4, 3, 8, 6, 1, 0, 9, 2};
        int evenCount = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] % 2 == 0) {
                evenCount = evenCount + 1;
            }
        }

        System.out.println(evenCount);
    }
}
