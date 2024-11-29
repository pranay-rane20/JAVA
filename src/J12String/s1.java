package J12String;

import java.util.Scanner;

public class s1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        System.out.println(s);
        String s = "madam";
        String rev = "";
        for(int i=s.length()-1 ; i>-1 ; i--){
            rev += s.charAt(i);
        }
        System.out.println(s.equals(rev) ? "Pallindrom":"Not Pallindrom");


    }
}
