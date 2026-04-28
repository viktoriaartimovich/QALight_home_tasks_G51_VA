package java_hw_7;

public class OrderManager {

    public double calculateTotal(Order[] firstOrder) {
        double sum = 0;

        for (int i = 0; i < firstOrder.length; i++) {
            if (firstOrder[i].getStatus().equals("NEW")) {
                sum = sum + firstOrder[i].getPrice();
            }
        }
        return sum;
    }
}
