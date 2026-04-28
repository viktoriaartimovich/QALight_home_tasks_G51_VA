package java_hw_2;

public class NumberPosNegNullCheck {
    public static void main(String[] args) {
        int a = -7;

        if(a > 0){
            System.out.println("Number is positive");
        }else if(a < 0){
            System.out.println("Number is negative");
        }else{
            System.out.println("This is 0");
        }
    }
}
