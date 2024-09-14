package Tut03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class RandomNums {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(10));
        }


        System.out.println("Random numbers: " );
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
