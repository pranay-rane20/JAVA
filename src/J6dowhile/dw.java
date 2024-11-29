//calculator
package J6dowhile;

import java.util.Scanner;

public class dw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("welcome to calculator");
            System.out.println("1-Addition \n2-Multiplication \n3-exit");
            ch = sc.nextInt();
            if(ch ==1){
                //addition
                System.out.println("give two number");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("sum = " + (a+b));
            } else if (ch==2) {
                //subtraction
                System.out.println("give two number");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("multiply = " + (a*b));
            }
            else {
//                System.out.println("wrong input");
                break;
            }

        }while(true);
    }
}
