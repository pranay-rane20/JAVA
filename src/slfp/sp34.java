package slfp;

import java.util.Arrays;

public class sp34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,7,7,8,8,10,11};
        int target = 7;
        int beg=0;
        int end = nums.length-1;
        int[] ans = {-1,-1};

        while(beg<=end){
            int mid = (beg+end)/2;
           if(nums[mid]>target) end = mid -1;
           else if (nums[mid]<target) beg = mid + 1;
           else{
               ans[0] = mid;
               end = mid-1;
           }
        }
        beg =0;
        end = nums.length-1;
        while(beg<=end){
            int mid = (beg+end)/2;
            if(nums[mid]>target) end = mid -1;
            else if (nums[mid]<target) beg = mid + 1;
            else{
                ans[1] = mid;
                beg = mid+1;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
