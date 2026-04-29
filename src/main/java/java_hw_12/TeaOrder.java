package java_hw_12;

public class TeaOrder extends Order {

    private TeaType type;

    public TeaOrder(int orderNumber, OrderStatus status, TeaType type) {
        super(orderNumber, status);
        this.type = type;
    }

    public TeaType getType() {
        return type;
    }

    public void setType(TeaType type) {
        this.type = type;
    }

    @Override
    public double getPrice(){
        switch (type){
            case BLACK:
                return 1.0;
            case GREEN:
                return 2.0;
            case HERBAL:
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
