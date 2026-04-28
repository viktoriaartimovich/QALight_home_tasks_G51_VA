package java_hw_4.task3;

public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(6);
        Circle circle3 = new Circle(10.5);

        Circle[] arrayOfCircles = {circle1, circle2, circle3};

        for(int i =0; i < arrayOfCircles.length; i++){
            System.out.println("Circle: " + arrayOfCircles[i] + ", Area = " + arrayOfCircles[i].areaOfCircle() + ", "
                    + " Circumference = " + arrayOfCircles[i].circumferenceOfCircle());
        }
    }
}
