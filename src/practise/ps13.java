package practise;

import java.util.Arrays;

public class ps13 {
    public static void main(String[] args) {
        int[] arr = {8,10,-1,0,12,-2,5,-3};
        int n = arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            while(i<n && arr[i]>0) i++;
            while(j>=0 && arr[j]<0) j--;
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
