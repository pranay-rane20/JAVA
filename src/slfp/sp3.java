package slfp;

public class sp3 {

    public static int findNumbers(int[] nums) {
        int evencount =0;
        for(int i=0; i<nums.length ; i++){
            int count =0;
            while(nums[i]>0){
                nums[i] /= 10;
                count++;
//                System.out.println(nums[i]);
            }
            if (count%2 == 0){
                evencount++;
            }
        }
        return evencount;
    }
    public static void main(String[] args) {
        int arr[] = {555,901,482,1771};
        System.out.println(findNumbers(arr));
    }
}
