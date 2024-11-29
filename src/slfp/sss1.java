package slfp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
public class sss1 {

    public static int maximumSetSize(int[] nums1, int[] nums2) {
        int n = nums1.length / 2;
        HashSet<Integer> ans = new HashSet<>();

        ArrayList<Integer> s1 = new ArrayList<>();
        for (int i : nums1)
            s1.add(i);
        System.out.println(s1);
        ArrayList<Integer> s2 = new ArrayList<>();
        for (int i : nums2)
            s2.add(i);
        System.out.println(s2);

        while (n-- > 0) {
            for (int i : nums1) {
                if (s2.contains(i))
                    s2.remove(i);
                else s2.remove(0);
            }
            for(int i: nums2){
                if(s1.contains(i)) s1.remove(i);
//                System.out.println();
                else s1.remove(0);
            }
        }
        System.out.println(s1);
        System.out.println(s2);
        ans.addAll(s1);
        ans.addAll(s2);
        return ans.size();

    }

    public static void main(String[] args) {
       int[] nums1 = {1,2,1,2};
       int[] nums2 = {1,1,1,1};
        System.out.println(maximumSetSize(nums1,nums2));
    }
}
