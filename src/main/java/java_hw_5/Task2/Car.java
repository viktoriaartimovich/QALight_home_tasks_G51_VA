package java_hw_5.Task2;

public class Car extends Vehicle {

    private int passengerCapacity;

    public Car(String name, int speed, int passengerCapacity) {
        super(name, speed);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "passengerCapacity=" + passengerCapacity +
                '}';
    }

    @Override
    public void move(){
        System.out.println("Vehicle " + "'" + this.getName() + "'" + " is moving with a speed: " + this.getSpeed()
                + " km/h with " + this.getPassengerCapacity() + " people.");
    }
}
