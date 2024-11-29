package J3controlflow;

import java.util.Scanner;

public class javac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the percentage(1-100%):");
        double percentage = sc.nextDouble();
        char grade;
        if(percentage <=100 && percentage >=90){
            System.out.println("A+");
        }
        else if(percentage>=80 && percentage<90){
            System.out.println("A");
        }
        else if(percentage>=70 && percentage<80){
            System.out.println("B+");
        }
        else if(percentage>=60 && percentage<70){
            System.out.println("B");
        }
        else if(percentage>=50 && percentage<60){
            System.out.println("C+");
        }
        else if(percentage>=40 && percentage<50){
            System.out.println("C");
        }
        else if(percentage>=33 && percentage<40){
            System.out.println("D");
        }
        else if (percentage>100) {
            System.out.println("Enter valid percentage");
        }
        else {
            System.out.println("FAIL!!!");
        }
    }
}
