package practise;

import java.util.Scanner;

public class ps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        String s = "";

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
            sum += arr[i];
            if(i==arr.length-1) s=s+arr[i];
            else s = s + arr[i] + " + ";
        }
        System.out.println( s + " = " + sum);
    }
}
