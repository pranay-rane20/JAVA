package J8Array;

import java.util.Arrays;

//left rotate by k=3
//{1,2,3,4,5,6,7,8}
//{4,5,6,7,8,1,2,3}
public class a8 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        int k=3;
        k %=n;
        while(k-->0){
            int a =arr[0];
            for(int i=0;i<n-1;i++){
                arr[i]=arr[i+1];
            }
            arr[n-1]=a;
        }
        System.out.println(Arrays.toString(arr));



    }
}
