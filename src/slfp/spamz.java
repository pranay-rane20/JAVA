package slfp;
//infinite array

public class spamz {
    public static int m1(int[] arr , int target,int start,int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int ans(int[] arr , int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int newstart = end + 1;
            end = end + (end-start+1)*2;
            start = newstart;
        }
        return m1(arr,target,start,end);
    }

        public static void main (String[]args){
            int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
            int target = 10;
            System.out.println(ans(arr,target));

        }

}