package J4Loop;

import java.util.Scanner;

public class java9 {
    public static void main(String[] args) {
        System.out.println("Enter two number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 1;
        for(int i = 1; i<=b ; i++){

            result *= a;

        }
        System.out.println(result);

    }
}
