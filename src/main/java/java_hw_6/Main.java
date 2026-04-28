package java_hw_6;

public class Main {
    public static void main(String[] args) {

        TeaOrder teaOrder1 = new TeaOrder(1,"black");
        TeaOrder teaOrder2 = new TeaOrder(1, "green");

        CoffeeOrder coffeeOrder1 = new CoffeeOrder(2,"small");
        DessertOrder dessertOrder1 = new DessertOrder(3,"Napoleon");

        Order[] firstOrder = {teaOrder1, teaOrder2, coffeeOrder1, dessertOrder1};

        teaOrder1.printOrderInfo();
        teaOrder2.printOrderInfo();
        coffeeOrder1.printOrderInfo();
        dessertOrder1.printOrderInfo();

        OrderManager orderManager = new OrderManager();

        System.out.println("Sum of first order: " + orderManager.calculateTotal(firstOrder));
    }
}
