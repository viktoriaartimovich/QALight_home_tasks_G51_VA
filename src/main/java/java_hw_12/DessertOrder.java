package java_hw_12;

public class DessertOrder extends Order {

    private DessertName dessertName;

    public DessertOrder(int orderNumber, OrderStatus status, DessertName dessertName) {
        super(orderNumber, status);
        this.dessertName = dessertName;
    }

    public DessertName getDessertName() {
        return dessertName;
    }

    public void setDessertName(DessertName dessertName) {
        this.dessertName = dessertName;
    }

    @Override
    public double getPrice() {
       switch (dessertName){
           case TIRAMISU:
               return 5.0;
           case NAPOLEON:
               return 6.0;
           case BROWNIE:
               return 7.0;
           default:
               return 0;
       }
    }

    @Override
    public void printOrderInfo(){
        System.out.println("Order number is: " + this.getOrderNumber() + ", " + "Desert ordered: " + this.getDessertName()  + ", Order status: " +this.getStatus());
    }

    @Override
    public String toString() {
        return "DessertOrder{" +
                "dessertName='" + dessertName + '\'' +
                ", orderNumber=" + getOrderNumber() +
                '}';
    }
}
