package java_hw_10;

import java_hw_10.exceptions.InvalidOrderStatusException;

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

    public void setStatus(String status) throws InvalidOrderStatusException {
        try{
            if (!status.equals("NEW")
                    && !status.equals("COMPLETED")
                    && !status.equals("CANCELLED")){
                throw new InvalidOrderStatusException("Invalid orders status");
            }
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
