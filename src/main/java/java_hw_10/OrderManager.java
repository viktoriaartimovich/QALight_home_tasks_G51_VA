package java_hw_10;

import java_hw_10.exceptions.DuplicateOrderException;
import java_hw_10.exceptions.NoOrdersException;
import java_hw_10.exceptions.OrderNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderManager {

    List<Order> orders = new ArrayList<>();

    public double calculateTotal(List<Order> orders) throws NoOrdersException {

        try {
            if (orders.isEmpty()) {
                throw new NoOrdersException("Order is empty, there is nothing to calculate");
            }
            double sum = 0;

            for (int i = 0; i < orders.size(); i++) {
                sum = sum + orders.get(i).getPrice();
            }
            return sum;
        } catch (NoOrdersException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public void addOrder(Order order) throws DuplicateOrderException {
        try {
            for (int i = 0; i < orders.size(); i++) {
                if (orders.get(i).getOrderNumber() == order.getOrderNumber()) {
                    throw new DuplicateOrderException("This order already exists");
                }
            }
            orders.add(order);
        } catch (DuplicateOrderException ex) {
            ex.printStackTrace();
        }

    }

    public void removeOrderByNumber(int orderNumber) throws OrderNotFoundException {
        try {
            for (int i = 0; i < orders.size(); i++) {
                if (orders.get(i).getOrderNumber() == orderNumber) {
                    orders.remove(i);
                    return;
                }
            }
            throw new OrderNotFoundException("This order doesn't exist");
        } catch (OrderNotFoundException ex) {
            ex.printStackTrace();
        }

    }

    public Order findOrderByNumber(int orderNumber) throws OrderNotFoundException {
        try {
            for (int i = 0; i < orders.size(); i++) {
                if (orders.get(i).getOrderNumber() == orderNumber) {
                    return orders.get(i);
                }
            }
            throw new OrderNotFoundException("This order doesn't exist");
        } catch (OrderNotFoundException ex) {
            ex.printStackTrace();
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

        count.put("Tea", 0);
        count.put("Coffee", 0);
        count.put("Dessert", 0);

        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i) instanceof TeaOrder) {
                count.put("Tea", count.get("Tea") + 1);
            } else if (orders.get(i) instanceof CoffeeOrder) {
                count.put("Coffee", count.get("Coffee") + 1);
            } else if (orders.get(i) instanceof DessertOrder) {
                count.put("Dessert", count.get("Dessert") + 1);
            }

        }
        return count;
    }

    @Override
    public String toString() {
        return "OrderManager{" + "orders=" + orders + '}';
    }
}
