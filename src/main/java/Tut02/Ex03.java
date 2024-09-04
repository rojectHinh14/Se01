package Tut02;

public class Ex03 {
    public static int sumArr1(int[] arr){
        if(arr.length == 0 || arr == null ){
            return 0;
        }
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        return sum;
    }



    public static int sumArr2(int[] arr){
        if(arr.length == 0 || arr == null ){
            throw new IllegalArgumentException("Array must not be empty or null");
        }
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
