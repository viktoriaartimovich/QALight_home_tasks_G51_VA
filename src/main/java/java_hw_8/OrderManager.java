package java_hw_8;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public String toString() {
        return "OrderManager{" + "orders=" + orders + '}';
    }
}
