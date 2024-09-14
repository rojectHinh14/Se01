package Tut03;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class IntegerLinkedList extends LinkedList<Integer> {
    public Iterator<Integer> evenIterator() {
        return new EvenIterator(this);
    }

    private static class EvenIterator implements Iterator<Integer> {


        private IntegerLinkedList list;
        private int currentIndex;

        public EvenIterator(IntegerLinkedList list) {
            this.list = list;
            this.currentIndex = 0;
        }

        // 1 2 3 4 5 6 7 8 9
        @Override
        public boolean hasNext() {
            while (currentIndex < list.size()) {
                if (list.get(currentIndex) % 2 == 0) {
                    return true;
                }
                currentIndex++;
            }
            return false;
        }

        @Override
        public Integer next() {

            while (currentIndex < list.size()) {
                if (list.get(currentIndex) % 2 == 0) {
                    return list.get(currentIndex++);
                }
                currentIndex++;
            }
            throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        IntegerLinkedList list = new IntegerLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        Iterator<Integer> iterator = list.evenIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
