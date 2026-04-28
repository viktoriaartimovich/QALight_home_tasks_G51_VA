package java_hw_9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderManager {

    List<Order> orders = new ArrayList<>();

    public double calculateTotal(List<Order> orders) {
        double sum = 0;

        for (int i = 0; i < orders.size(); i++) {
            sum = sum + orders.get(i).getPrice();
        }
        return sum;
    }

    public void addOrder(Order orders) {
        this.orders.add(orders);
    }

    public void removeOrderByNumber(int orderNumber) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderNumber() == orderNumber) {
                orders.remove(i);

            }
        }
    }

    public Order findOrderByNumber(int orderNumber) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderNumber() == orderNumber) {
                return orders.get(i);
            }
        }
        return null;
    }

    public List<Order> getOrderByStatus(String status) {
        List<Order> ordersByStatus = new ArrayList<>();
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getStatus().equals(status)) {
                ordersByStatus.add(orders.get(i));
            }
        }
        return ordersByStatus;
    }

    Map<String, Integer> getOrderTypeCount() {
        Map<String, Integer> count = new HashMap<>();

        count.put("Tea",0);
        count.put("Coffee", 0);
        count.put("Dessert", 0);

        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i) instanceof TeaOrder) {
                count.put("Tea", count.get("Tea") + 1);
            } else if (orders.get(i) instanceof CoffeeOrder) {
                count.put("Coffee", count.get("Coffee") + 1);
            } else if (orders.get(i) instanceof DessertOrder) {
                count.put("Dessert", count.get("Dessert")+ 1);
            }

        }
        return count;
    }

    @Override
    public String toString() {
        return "OrderManager{" + "orders=" + orders + '}';
    }
}
