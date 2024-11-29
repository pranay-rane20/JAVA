package J3controlflow;

import java.util.Scanner;

public class java4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = sc.nextDouble();
        double per = 0;
        if(total > 5000 && total <=7000){
            per=10;
        }
        else if(total>7000 && total<=10000){
            per=20;
        }
        else if(total > 10000){
            per = 30;
        }
        double dis = total * per/100;
        double amt = total - dis;
        System.out.println(amt);
    }
}
