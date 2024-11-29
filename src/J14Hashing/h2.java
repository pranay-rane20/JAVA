package J14Hashing;

import java.util.HashMap;
import java.util.Map;

public class h2 {
    public static void main(String[] args) {
        int arr[] = {12,4324,46,4};
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"adt");
        map.put(2,"aditya");
        map.put(3,"rane");
        map.put(2,"labra");
        System.out.println(map);
        map.remove(3);
        System.out.println(map.remove(30));
        System.out.println(map);
        //getOrDefault ,,, containsKey ,,,,, put ,,,,, remove

        //traversal
//        for(var e : map.entrySet()) both
        // for for(var e : map.values()) values
        for(Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println(e);
        }


//        ArrayList<HashMap<Integer, List<String>>> list = new ArrayList<>();
//        for(var data : list){
//        }


    }
}
