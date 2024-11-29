package slfp;

import java.util.Arrays;

public class L2293 {


    public int minMaxGame(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        int[] nextNums = new int[nums.length / 2];
        for (int i = 0; i < nextNums.length; ++i)
            nextNums[i] = (i & 1) == 1 ? Math.max(nums[2 * i], nums[2 * i + 1])
                    : Math.min(nums[2 * i], nums[2 * i + 1]);
        return minMaxGame(nextNums);
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 2, 4, 8, 2, 2};
        int n = nums.length;
        int j = 1;
        while (j-- > 0) {
            int[] newnums = new int[n / 2];
//            if(newnums.length==1) System.out.println(nums[0]);
//            else{
            for (int i = 0; i < newnums.length; i++) {
                if (i % 2 == 0) newnums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
                else newnums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
//                }
                System.out.println(Arrays.toString(newnums));

            }
        }
    }
}
