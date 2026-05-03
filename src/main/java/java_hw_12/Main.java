package java_hw_12;

import java_hw_12.enums.CoffeeSize;
import java_hw_12.enums.DessertName;
import java_hw_12.enums.TeaType;
import java_hw_12.enums.OrderStatus;

public class Main {
    public static void main(String[] args) {

        TeaOrder teaOrder1 = new TeaOrder(1, OrderStatus.NEW, TeaType.BLACK);
        TeaOrder teaOrder2 = new TeaOrder(2, OrderStatus.NEW, TeaType.HERBAL);
        CoffeeOrder coffeeOrder1 = new CoffeeOrder(3,OrderStatus.CANCELLED, CoffeeSize.SMALL);
        DessertOrder dessertOrder1 = new DessertOrder(4,OrderStatus.NEW, DessertName.NAPOLEON);
        DessertOrder dessertOrder2 = new DessertOrder(5,OrderStatus.NEW, DessertName.TIRAMISU);

        OrderManager orderManager = new OrderManager();

        orderManager.addOrder(teaOrder1);
        orderManager.addOrder(teaOrder2);
        orderManager.addOrder(coffeeOrder1);
        orderManager.addOrder(dessertOrder1);
        orderManager.addOrder(dessertOrder2);

        teaOrder1.printOrderInfo();
        teaOrder2.printOrderInfo();
        coffeeOrder1.printOrderInfo();
        dessertOrder1.printOrderInfo();
        dessertOrder2.printOrderInfo();

    }
}
