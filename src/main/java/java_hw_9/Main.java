package java_hw_9;

public class Main {
    public static void main(String[] args) {

        TeaOrder teaOrder1 = new TeaOrder(1,"black");
        TeaOrder teaOrder2 = new TeaOrder(2, "green");
        CoffeeOrder coffeeOrder1 = new CoffeeOrder(3,"small");
        DessertOrder dessertOrder1 = new DessertOrder(4,"Napoleon");
        DessertOrder dessertOrder2 = new DessertOrder(4,"Tiramisu");

        OrderManager orderManager = new OrderManager();
        orderManager.addOrder(teaOrder1);
        orderManager.addOrder(teaOrder2);
        orderManager.addOrder(coffeeOrder1);
        orderManager.addOrder(dessertOrder1);
        orderManager.addOrder(dessertOrder2);

        teaOrder1.setStatus("CANCELED");

        teaOrder1.printOrderInfo();
        teaOrder2.printOrderInfo();
        coffeeOrder1.printOrderInfo();
        dessertOrder1.printOrderInfo();
        dessertOrder2.printOrderInfo();

        orderManager.removeOrderByNumber(1);
        System.out.println(orderManager);
        System.out.println(orderManager.findOrderByNumber(4));
        System.out.println(orderManager.getOrderByStatus("NEW"));
        System.out.println("Sum of orders with status = NEW: " + orderManager.calculateTotal(orderManager.getOrderByStatus("NEW")));

        System.out.println(orderManager.getOrderTypeCount());

    }
}
