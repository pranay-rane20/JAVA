package J12String;
//Pallindromic String using method and Two pointer algorithm (hint: Array reverse algo)

public class s2 {
    public static  boolean ispalin(String s){
        int i=0 , j=s.length()-1;
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--))return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "madam";
        System.out.println(ispalin(s));
    }
}
