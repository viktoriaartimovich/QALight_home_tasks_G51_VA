package java_hw_6;

public class OrderManager {

    public double calculateTotal(Order[] firstOrder){
        double sum = 0;

        for (int i = 0; i < firstOrder.length; i++){
            sum = sum + firstOrder[i].getPrice();
        }
        return sum;
    }
}
