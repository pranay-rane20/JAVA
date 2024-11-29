package J8Array;
//Move all the negative elements on left side and positive elements on right side with extra space in O(n)

import java.util.Arrays;

public class a12q64 {
    public static void main(String[] args) {
         int arr[] = {-5,3,2,-1,-7,8,13,-12};
         int n = arr.length;
         int i=0;
         int j=arr.length-1;
         while(i<j){
             while(i<arr.length && arr[i]<0) i++;
             while(j>=0 && arr[j]>0) j--;
             if(i<j){
                 int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
             }
         }
        System.out.println(Arrays.toString(arr));
    }
}
