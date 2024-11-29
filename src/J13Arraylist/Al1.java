package J13Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Al1 {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list = new ArrayList<>();

        //-------METHOD-------
        //add, remove, getFirst , set, remove, get, contains, indexOf,
        //isEmpty , size,  toArray  ,, toString

        list.add(4);
        list.add(33);
        list.add(4);
        list.add(33);
        list.add(4);
        list.add(33);
        list.add(4);
        list.add(33);
        list.add(4);
        list.add(33);
        list.set(0,99);

//        System.out.println(list.getLast());
//        list.remove(0);
//        System.out.println(list );



        //---traversal---//
        ArrayList<Integer> wow = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        //input
        for(int i=0; i<5 ; i++){
            wow.add(in.nextInt());
        }
        //output
        for(int i=0; i<5; i++){
            System.out.println(wow.get(i));
        }
        System.out.println(wow);






    }
}
