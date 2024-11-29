package J8Array;
//max term of the given array


import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,74,53,56,36};
        int max = arr[0];
        int index=0;
        for(int i=1;i< arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }

}
