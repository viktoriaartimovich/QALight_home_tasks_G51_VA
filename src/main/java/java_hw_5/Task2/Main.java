package java_hw_5.Task2;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("CarName",100, 5);
        Truck truck = new Truck("TruckName", 60,30);

        car.move();
        car.stop();
        truck.move();
        truck.stop();

    }
}
