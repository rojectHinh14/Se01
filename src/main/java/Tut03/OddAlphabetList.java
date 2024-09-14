package Tut03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OddAlphabetList {
    public List<Character> createdList(){
        List<Character> list = new ArrayList<Character>();

        for(char ch ='a'; ch <= 'z'; ch++){
            if((int)ch%2!=0){
                list.add(ch);
            }
        }

        Iterator<Character> iter = list.iterator();
        while(iter.hasNext()){
            System.out.println( iter.next());
        }
        return list;
    }

    public static void main(String[] args) {
        OddAlphabetList OddAlphabetList = new OddAlphabetList();
        OddAlphabetList.createdList();
    }
}
