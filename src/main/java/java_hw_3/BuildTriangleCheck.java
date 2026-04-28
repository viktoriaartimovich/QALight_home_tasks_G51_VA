package java_hw_3;
import java.util.Scanner;

public class BuildTriangleCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        while (!scanner.hasNextInt()) { //check if entered data is integer
            System.out.println("Please enter only numbers");
            scanner.next(); //delete incorrect entered data
        }
        int a = scanner.nextInt();

        System.out.println("Enter b: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter only numbers");
            scanner.next();
        }
        int b = scanner.nextInt();

        System.out.println("Enter c: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter only numbers");
            scanner.next();
        }
        int c = scanner.nextInt();
        boolean result = buildTriangle(a, b, c);

        if (result) { //same as result == true
            System.out.println("Numbers are correct for building the triangle");
        } else { //false flow
            System.out.println("Numbers are incorrect for building the triangle");
        }
    }

    public static boolean buildTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        } else {
            return false;
        }
    }
}
