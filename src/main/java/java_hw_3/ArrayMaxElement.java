package java_hw_3;

public class ArrayMaxElement {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {1,4,6,1,8};
        int max = arrayOfNumbers[0];

        for(int i = 0; i < arrayOfNumbers.length; i++){
            if (arrayOfNumbers[i] > max){
                max = arrayOfNumbers[i];
            }
        }
        System.out.println(max);
    }
}
