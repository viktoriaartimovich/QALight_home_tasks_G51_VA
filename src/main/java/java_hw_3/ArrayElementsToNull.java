package java_hw_3;

public class ArrayElementsToNull {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {1, -5, -7, 4, 0};

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] < 0) {
                arrayOfNumbers[i] = 0;
            }
            System.out.println(arrayOfNumbers[i]);
        }
    }
}
