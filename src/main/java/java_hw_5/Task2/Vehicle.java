package java_hw_5.Task2;

public class Vehicle {

    private String name;
    private int speed;

    public Vehicle(String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void move(){
        System.out.println("Vehicle is moving with a speed: " + this.speed  + " km/h");
    }

    public void stop(){
        System.out.println("Vehicle " + "'" + this.name + "'" + " stopped.");
    }
}
