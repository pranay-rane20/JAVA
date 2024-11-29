package J14Hashing;

import java.util.HashMap;
import java.util.Map;

public class Hashing2 {
    public static void main(String[] args) {
        //creating
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map1 = new HashMap<>();

        map.put(4,0);
        int a = map.get(4);
        System.out.println(a);

        //insertion
        map.put(1,20);
        map.put(2,21);
        map.put(3,22);
        map.put(4,23);
        map.put(5,24);
        map.put(3,44);
        map.put(3,0);
//        System.out.println(map.get(0));
        System.out.println(map);


        //search---->containsKey
        //search---->constainsValue
        if(map.containsKey(2)) System.out.println("true");
        if(map.containsValue(24)) System.out.println("ture");

        //print
        System.out.println(map.get(4));
        System.out.println(map.get(33));  //null

        //iteration
         for(Map.Entry<Integer,Integer> e : map.entrySet()){
             System.out.print(e.getKey() + " ");
             System.out.println(e.getValue());
         }

         //delete
//        map.remove(2 );
//        System.out.println(map);

    }
}
