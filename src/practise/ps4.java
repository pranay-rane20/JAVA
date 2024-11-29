//abundant number
package practise;

import java.util.Scanner;

public class ps4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<n/2;i++){
            if(n%i==0){
                sum += i;
            }
        }
        if(sum>n){
            System.out.println("abundant number");
        }
        else System.out.println("not a abundant number");
    }
}
