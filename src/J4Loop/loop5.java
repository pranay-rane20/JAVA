package J4Loop;

import java.util.Scanner;

public class loop5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumeven = 0 , sumodd = 0;
        for(int i = 1; i<=n ; i++){
            if(i%2==0){
                sumeven +=i;
            }
            else {
                sumodd += i;
            }
        }
        System.out.println(sumeven);
        System.out.println(sumodd);

    }
}
