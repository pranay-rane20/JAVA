package practise;

//given a sorted array of distinct elements , the task is to find the summation of absolute differences of all pairs in the given array

public class ps7 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n = arr.length;
        int sum =0;
        for(int i =0 ;i<n-1;i++){
            for(int j=i+1;j<n;j++){
//                sum = arr[j] - arr[i];
                sum += Math.abs(arr[i]-arr[j]);
            }
        }
        System.out.println(sum);
    }
}
