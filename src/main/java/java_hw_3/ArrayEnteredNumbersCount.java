package java_hw_3;

import java.util.Scanner;

public class ArrayEnteredNumbersCount {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {1, 4, 6, 7, 1, 7, 1, 9, 3, 1};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        while(!scanner.hasNextInt()){
            System.out.println("Please enter only numbers");
            scanner.next();
        }
        int enteredNumber = scanner.nextInt();

        int count = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] == enteredNumber) {
                count = count + 1;
            }
        }
        System.out.println("Number " + enteredNumber + " exists in array " + count + " times.");
    }
}
