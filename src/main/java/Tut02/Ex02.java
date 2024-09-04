package Tut02;

public class Ex02 {
    public static int search(int[] a, int x) throws NullPointerException,NotFoundException{
        if(a == null || a.length == 0){
            throw new NullPointerException("Array is null");
        }
        for (int i =0; i< a.length; i++ ){
            if(a[i] == x){
                return i;
            }
        }
        throw new NotFoundException("Element not in array");
    }


public static int search2(int[] a, int x) throws NullPointerException,NotFoundException{
        if(a==null){
            throw new NullPointerException("Array is null");
        }
        int i = 0;
        try{
            while(true){
                if(a[i] == x){
                    return i;
                }
                i++;
            }
        }catch(IndexOutOfBoundsException  e){
            throw new NotFoundException("Element not in array");
        }
}

    public static void main(String[] args) throws NotFoundException {
        int[]arr = {1, 2 , 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 5;
        Ex02.search(arr, 20);
    }

}
