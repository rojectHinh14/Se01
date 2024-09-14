package Tut03;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class PrimeLinkedList extends LinkedList<Integer> {
    public Iterator<Integer> primeIterator() {
        return new PrimeIterator(this);
    }

    public static class PrimeIterator implements Iterator<Integer> {
        private int currentIndex;
        private PrimeLinkedList list;

        public PrimeIterator(PrimeLinkedList list) {
            this.list = list;
            this.currentIndex = 0;
        }


        @Override
        public boolean hasNext() {
            while (currentIndex < list.size()) {
                if (isPrime(list.get(currentIndex))) {
                    return true;
                }
                currentIndex++;
            }
            return false;
        }

        @Override
        public Integer next() {
            while (currentIndex < list.size()) {
                if (isPrime(list.get(currentIndex))) {
                    return list.get(currentIndex);
                }
                currentIndex++;
            }
            throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    return false;
                }

            }
            return true;
        }
    }
}
