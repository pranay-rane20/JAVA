package slfp;

import java.util.HashMap;

public class L1748 {

    public static int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        for(int e: nums){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        System.out.println(map);

        for(int key : map.keySet()){
            if(map.get(key) ==1) sum+=key;
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(sumOfUnique(arr));
    }
}
