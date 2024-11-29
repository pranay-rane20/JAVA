package projects;
//System.out.println((int)(Math.random()*100+1));

import java.util.Scanner;

public class Guessgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myguess = (int)(Math.random()*100 + 1);
        System.out.println("Guess the number 1-100");
        int maxguesses = 10;
        do {
            maxguesses--;
            int userGuess = sc.nextInt();
            if(userGuess==myguess){
                System.out.println("winner");
                break;
            }

            if(maxguesses==0){
                System.out.println("Loser");
                break;
            }

            if(userGuess>myguess){
                System.out.println("OOps number is too large..");
            }

            else System.out.println("oops number is too small");
        }while (true);
    }
}
