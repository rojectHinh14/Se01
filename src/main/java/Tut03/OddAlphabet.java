package Tut03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OddAlphabet {
    public List<Character> oddAlphabet() {
        List<Character> l1 = new ArrayList<Character>();
        for(char ch = 'A'; ch <= 'Z'; ch++) {
            l1.add(ch);
        }

        Iterator<Character> iter = l1.iterator();
        while(iter.hasNext()) {
            Character currentChar = iter.next();
            if ((int) currentChar % 2 == 0) {
                iter.remove();
            } else {
                System.out.println(currentChar);
            }
        }
        return l1;
    }

    public static void main(String[] args) {
        OddAlphabet oddAlphabet = new OddAlphabet();
        oddAlphabet.oddAlphabet();
    }
}
