package slfp;

import java.util.Collections;
import java.util.TreeMap;

public class L2418 {

    public static String[] sortPeople(String[] names, int[] heights) {
        // tree map
        //collextions.reverseorder()
        TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
//        System.out.println(map);
        String ans[] = new String[names.length];
        int i=0;
        for(var e : map.values()){
            ans[i++] = e;
        }
        return ans;
    }




    public static void main(String[] args) {

           String[]  names = {"Mary","John","Emma"};
            int[] heights = {180,165,170};
        System.out.println(sortPeople(names,heights));
    }


}
