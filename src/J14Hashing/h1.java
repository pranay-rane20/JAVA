package J14Hashing;
//84 que no.

import java.util.*;

public class h1 {
    public static void main(String[] args) {
//        Set<Integer> sc = new HashSet<>();
        int arr[] = {1,2,3,48,5,3,3,5,6,7,9};
        ArrayList<Integer> uniq  = new ArrayList<>();
        for(int e : arr){
            if(!uniq.contains(e))uniq.add(e);
        }
        System.out.println(uniq);

        //
        Set<Integer> uni  = new HashSet<>();
        for(int e : arr){
            uni.add(e);
        }
        System.out.println(uni);


        //traversing on set
        int ans[] = new int[uni.size()];
        int i=0;
        for(int e : uni){
            ans[i++] = e;
        }
        System.out.println(Arrays.toString(ans));

    }
}
