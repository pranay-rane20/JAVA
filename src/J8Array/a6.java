package J8Array;

import java.util.Arrays;
import java.util.Scanner;

public class a6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr1[] = new int[size];
        for(int i=0;i<size;i++){
            arr1[i] = sc.nextInt();
        }
        int copy[] = new int[size];
        int j=0;
        for(int i=size-1;i>=0;i--){
            copy[j++] = arr1[i];
        }

        for(int i=0;i<size;i++){
            System.out.print(copy[i] + " ");
        }
        System.out.println();

        //to print the array  
        System.out.println(Arrays.toString(copy));

    }
}
