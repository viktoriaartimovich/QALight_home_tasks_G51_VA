package java_hw_12;

import java_hw_12.enums.CoffeeSize;
import java_hw_12.enums.OrderStatus;

public class CoffeeOrder extends Order {

    private CoffeeSize size;

    public CoffeeOrder(int orderNumber, OrderStatus status, CoffeeSize size) {
        super(orderNumber, status);
        this.size = size;
    }

    public CoffeeSize getSize() {
        return size;
    }

    public void setSize(CoffeeSize size) {
        this.size = size;
    }

    @Override
    public double getPrice(){
        switch (size){
            case SMALL:
                return 1.0;
            case MEDIUM:
                return 2.0;
            case LARGE:
                return 3.0;
            default:
                return 0;
        }
    }

    @Override
    public void printOrderInfo(){
        System.out.println("Order number is: " + this.getOrderNumber() + ", " + "Coffee size: " + this.getSize() + ", Order status: " +this.getStatus());
    }

    @Override
    public String toString() {
        return "CoffeeOrder{" +
                "size='" + size + '\'' +
                ", orderNumber=" + getOrderNumber() +
                '}';
    }
}
