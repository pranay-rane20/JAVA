package J7Patterns;

import java.util.Scanner;

public class p4char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';
        for(int i = 1;i<=n;i++){
            for(char j =1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            ch = 'A';
            System.out.println();
        }
    }
}
