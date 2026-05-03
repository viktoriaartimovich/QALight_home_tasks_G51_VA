package java_hw_12;

import java_hw_12.exceptions.InvalidOrderStatusException;
import java_hw_12.enums.OrderStatus;

public abstract class Order implements Pricable, Printable {

    private int orderNumber;
    private OrderStatus status;

    public Order(int orderNumber, OrderStatus status) {
        this.orderNumber = orderNumber;
        this.status = status;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) throws InvalidOrderStatusException {
        try{
            if (status == null) {
                throw new InvalidOrderStatusException("Invalid orders status");
            }
            this.status = status;
        } catch (InvalidOrderStatusException ex){
            ex.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", status='" + status + '\'' +
                '}';
    }
}
