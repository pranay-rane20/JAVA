package J8Array;
//rotate the arry
//rotate left by 1

import java.util.Arrays;

public class a7 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        int a =arr[0];

        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=a;
        System.out.println(Arrays.toString(arr));

    }
}
