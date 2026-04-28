package java_hw_2;

public class NumberComparison {
    public static void main(String[] args) {
        int a = 0;
        int b = -5;

        if(a > b){
            System.out.println("Number " + a + " is bigger then number " + b);
        } else if (a < b) {
            System.out.println("Number " + a + " is smaller then number " + b);
        }else{
            System.out.println("Number " + a + " is equals to " + b);
        }
    }
}
