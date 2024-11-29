package J8Array;

import java.util.Scanner;

public class a4 {
    //find 2nd max term of the array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 24,23,45,42,66,25};
//        int max;
//        int smax;
//        if(arr[0]<arr[1]){
//            max = arr[1];
//            smax = arr[0];
//        }else{
//            max = arr[0];
//            smax = arr[1];
//        }
        int max = Math.max(arr[0],arr[1]);
        int smax = Math.min(arr[0],arr[1]);
        for(int i=2;i< arr.length;i++){
            if(arr[i]>max){
                smax = max;
                max = arr[i];
            }
            else if(arr[i]>smax){
                smax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);

    }
}
