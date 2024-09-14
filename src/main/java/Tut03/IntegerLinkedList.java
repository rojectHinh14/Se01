package Tut03;

import java.util.Iterator;
import java.util.LinkedList;

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
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Integer next() {
            return 0;
        }

        @Override
        public void remove() {
            Iterator.super.remove();
        }
    }
}
