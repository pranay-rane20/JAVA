package practise;

import java.util.Scanner;

public class ps6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
//         for(int i=n;i>=0;i--){
//             sum += i;
//         }
//        System.out.println(sum);


        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact*=i;
        }


    }
}
