package J8Array;
//61- Array Reverse Without Using Extra space

import java.lang.reflect.Array;
import java.util.Arrays;

public class a9 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
