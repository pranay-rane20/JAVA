package J14Hashing;

import java.util.HashMap;
import java.util.Map;

public class h3 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,48,5,3,3,5,6,77,9};

        Map<Integer,Integer> map = new HashMap<>();
        for(int e: arr){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        System.out.println(map);

    }
}
 