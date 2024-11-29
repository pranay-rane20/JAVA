package J14Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing1 {
    public static void main(String[] args) {
        //creating
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(6);
        set.add(3);
        set.add(2);
        System.out.println(set);

        //search-->contains
        if(set.contains(1)) System.out.println("contains");
        if(!set.contains(5)) System.out.println("does not contains");

        //delete--> remove
        set.remove(1);
        System.out.println(set);

        //size
        System.out.println(set.size());


        //----------iterator
        Iterator it = set.iterator();
        //hasNext(); ----> true/false
        // next(); ----> next value
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
