package Tut01;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {
public static int min(ArrayList<Integer> mang1){
    if(mang1.size()==0){
        return 0;
    }else{
        int min = mang1.get(0);
        for(int i=1;i<mang1.size();i++){
            if(min>mang1.get(i)){
                min = mang1.get(i);
            }
        }
        return min;
    }
}
    public static int max(ArrayList<Integer> mang1){
      if(mang1.size()==0){
          return 0;
      }   else{
          int max = mang1.get(0);
          for(int i=1;i<mang1.size();i++){
              if(max<mang1.get(i)){
                  max = mang1.get(i);
              }
          }
          return max;

          }
      }

      public static void main(String[] args) {
    ArrayList<Integer> mang1 = new ArrayList<>();
    mang1.add(1);
    mang1.add(2);
    mang1.add(3);
    mang1.add(4);
    mang1.add(5);


          System.out.println(Ex01.min(mang1));

          System.out.println(Ex01.max(mang1));

      }

    }



