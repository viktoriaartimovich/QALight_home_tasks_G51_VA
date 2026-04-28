package java_hw_10;

public class DessertOrder extends Order {

    private String dessertName;

    public DessertOrder(int orderNumber, String dessertName) {
        super(orderNumber);
        this.dessertName = dessertName;
    }

    public String getDessertName() {
        return dessertName;
    }

    public void setDessertName(String dessertName) {
        this.dessertName = dessertName;
    }

    @Override
    public double getPrice() {
       switch (dessertName){
           case "Tiramisu":
               return 5.0;
           case "Napoleon":
               return 6.0;
           case "Brownie":
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
