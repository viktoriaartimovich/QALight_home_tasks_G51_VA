package java_hw_6;

public abstract class Order {

    private int orderNumber;

    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public abstract double getPrice();

    public void printOrderInfo(){
        System.out.println("Order number is: " + this.getOrderNumber());
    };

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                '}';
    }
}
