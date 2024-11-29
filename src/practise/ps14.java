package practise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ps14 {
    public static void main(String[] args) {
        int[] arr = {8,10,-1,0,12,-2,5,-3};
         int n = arr.length;
         int j=0;
         for(int i = 0 ; i<n ; i++){
             if(arr[j++]>0){
                 int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = arr[i];
             }
         }
        System.out.println(Arrays.toString(arr));
    }
}
