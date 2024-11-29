package J3controlflow;

import java.util.Scanner;

public class javac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the movie name:");
        String movie = sc.nextLine();
        System.out.println("Enter the rating of the movie");
        double rating = sc.nextDouble();
        if(rating>=0.0 && rating<=2.0){
            System.out.println(movie + " is a Flop");
        } else if (rating >=2.1 && rating<=3.4) {
            System.out.println(movie + " is a Semi-Hit");
        }
        else if (rating >=3.5 && rating<=4.5) {
            System.out.println(movie + " is a Hit");
        }
        else if (rating >=4.6 && rating<=5.0) {
            System.out.println(movie + " is a Super Hit");
        }
    }
}
