package Tut02;

public class Ex04 {
    public static void combine(int[]a , int[] b){
        if(a== null ||a.length == 0){
            throw new IllegalArgumentException("Array must not be null ");

        }

        if(b== null || b.length == 0){
            throw new IllegalArgumentException("Array must not be null");
        }

        int sum = 0;
        for(int num : b){
            sum += num;

        }

        for(int i = 0; i< a.length; i++){
              a[i] *= sum;
        }
    }
}
