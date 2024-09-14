package Tut03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class First10Primes {
    public List<Integer> crateList() {
        List<Integer> list = new ArrayList<Integer>();
        int count = 0;
        int number = 2;
        while (count < 10) {
            if (isPrime(number)) {
                list.add(number);
                count++;
            }
            number++;
        }
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
        return list;
    }

    public boolean isPrime(int x) {
        if (x == 2) {
            return true;

        }
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
First10Primes f = new First10Primes();
f.crateList();
    }
}
