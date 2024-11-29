package J8Array;
//Bubble sort

import java.util.Arrays;

public class a13q66 {
    public static void main(String[] args) {

        int arr[] = { 7,2,6,3,9,4};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
