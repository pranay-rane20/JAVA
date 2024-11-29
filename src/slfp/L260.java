package slfp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class L260 {

    public static int[] singleNumber(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int e: nums){
            map.put(e,map.getOrDefault(e,0)+1);
        }
//        System.out.println(map);

        for(int key : map.keySet()){
            if(map.get(key) == 1)list.add(key);
        }
        int n = list.size();
//        System.out.println(n);
        int[] ans = new int[n];
//        int i=0;

        for(int i=0 ; i<n ; i++){
            ans[i] = list.get(i);
        }
//        for(var e: list){
//            ans[i++] = list.get(e);
//        }


//        System.out.println(Arrays.toString(ans));
//        System.out.println(list);
        return ans;

    }


    public static void main(String[] args) {
                int[] nums = {1, 2, 1, 3, 2, 5};
//                singleNumber(nums);
        System.out.println(singleNumber(nums));

    }
}
