package java_hw_5.Task2;

public class Truck extends Vehicle {

    private double loadCapacity;


    public Truck(String name, int speed, double loadCapacity) {
        super(name, speed);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "loadCapacity=" + loadCapacity +
                '}';
    }

    @Override
    public void move(){
        System.out.println("Vehicle " + "'" + this.getName() + "'" + " with load capacity: " + this.getLoadCapacity() +
                " is moving with speed " + this.getSpeed() + " km/h.");
    }
}
