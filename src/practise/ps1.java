package practise;

import java.util.Scanner;

public class ps1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        int count=0;
        while(num!=0){
            count++;
            num/=10;
        }
        if(count<10){
            System.out.println("not a valid ...");
        }

    }
}
