package J4Loop;

import java.util.Scanner;

public class loop7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n ; i++){
            if(n%i==0){
                sum +=i;
//                System.out.println(i + " is a factor of " + n);
            }
        }
        System.out.println(sum);
    }
}
