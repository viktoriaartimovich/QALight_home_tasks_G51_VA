package java_hw_7;

public class TeaOrder extends Order {

    private String type;

    public TeaOrder(int orderNumber, String type) {
        super(orderNumber);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double getPrice(){
        switch (type){
            case "black":
                return 1.0;
            case "green":
                return 2.0;
            case "herbal":
                return 3.0;
            default:
                return 0;
        }
    }

    @Override
    public void printOrderInfo(){
        System.out.println("Order number is: " + this.getOrderNumber() + ", " + "Tea type: " + this.getType()  + ", Order status: " +this.getStatus());
    }

    @Override
    public String toString() {
        return "TeaOrder{" +
                "type='" + type + '\'' +
                ", orderNumber=" + getOrderNumber() +
                '}';
    }
}
