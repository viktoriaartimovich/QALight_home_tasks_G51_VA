package java_hw_10;

public class CoffeeOrder extends Order {

    private String size;

    public CoffeeOrder(int orderNumber, String size) {
        super(orderNumber);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public double getPrice(){
        switch (size){
            case "small":
                return 1.0;
            case "medium":
                return 2.0;
            case "large":
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
