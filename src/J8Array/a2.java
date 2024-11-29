package J8Array;
//sum of the terms of the arrray

import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of terms in the array");
        int n = sc.nextInt();
        int sum=0;
        int arr[] = new int[n];
        System.out.println("enter the terms");
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
         for(int i=0;i<n;i++){

             sum += arr[i];
         }
        System.out.print("the sum of the array:");
        System.out.println(sum);

    }
}
