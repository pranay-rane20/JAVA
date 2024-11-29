//perfect square
package practise;

import java.util.Scanner;

public class ps3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sqrt= (int)Math.sqrt(n);
        if(sqrt * sqrt ==n){
            System.out.println("a perfect square");
        }
        else {
            System.out.println("not a perfect square");
        }

    }
}
