package java_hw_5.Task1;

public class Main {

    public static void main(String[] args) {
        Bird bird = new Bird();
        Fish fish = new Fish();
        Dog dog = new Dog();

        bird.eat();
        bird.sleep();
        bird.fly();

        fish.eat();
        fish.sleep();
        fish.swim();

        dog.eat();
        dog.sleep();
        dog.bark();

    }
}
