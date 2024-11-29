package practise;

import java.util.Arrays;

public class ps15 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,1,0,1,0,0,1,0};
        int n = arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            while(i<n && arr[i]!=1) i++;
            while(j>=0 && arr[j]!=0) j--;
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));


        while(i<n){
            int aj=0;
            if(arr[i]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }

    }
}
