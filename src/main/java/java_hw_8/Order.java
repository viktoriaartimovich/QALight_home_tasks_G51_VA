package java_hw_8;

public abstract class Order implements Pricable, Printable {

    private int orderNumber;
    private String status;

    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
        this.status = "NEW";
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", status='" + status + '\'' +
                '}';
    }
}
