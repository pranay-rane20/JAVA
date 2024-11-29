package practise;

import java.util.Scanner;

public class ps2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int rem;
//        int b = sc.nextInt();
        int dup = a;
        int sum = 0;
        while(a!=0){
            rem = a%10;
            sum +=rem;
            a/=10;
        }
        if(dup%sum==0){
            System.out.println("harshad number");
        }
        else{
            System.out.println("not a harshd number");
        }

    }
}
