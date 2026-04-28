package java_hw_4.task3;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double areaOfCircle() {
        return this.radius * this.radius * Math.PI;
    }

    public double circumferenceOfCircle() {
        return 2 * Math.PI * radius;
    }

}
