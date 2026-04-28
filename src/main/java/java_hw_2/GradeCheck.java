package java_hw_2;

public class GradeCheck {
    public static void main(String[] args) {
        int grade = 101;

        if (grade >= 0 && grade <= 49) {
            System.out.println("Не задовільно");
        } else if (grade >= 50 && grade <= 69) {
            System.out.println("Задовільно");
        } else if (grade >= 70 && grade <= 89) {
            System.out.println("Добре");
        } else if (grade >= 90 && grade <= 100) {
            System.out.println("Відмінно");
        }else if (grade < 0){
            System.out.println("Оцінка не може бути менше ніж 0");
        }else {
            System.out.println("Оцінка не може бути більше ніж 100");
        }
    }
}
