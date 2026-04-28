package java_hw_3;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number from 1 to 7: ");

        while(!scanner.hasNextInt()){
            System.out.println("Please enter only numbers");
            scanner.next();
        }
        int number = scanner.nextInt();

        System.out.println(day(number));

    }
    public static String day(int number) {
        if (number == 1) {
            return "Monday";
        } else if (number == 2) {
            return "Tuesday";
        } else if (number == 3) {
            return "Wednesday";
        } else if (number == 4) {
            return "Thursday";
        } else if (number == 5) {
            return "Friday";
        } else if (number == 6) {
            return "Saturday";
        } else if (number == 7) {
            return "Sunday";
        } else {
            return "It will be better if today will be friday";
        }
    }
}
