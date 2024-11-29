package slfp;

public class L2283 {

    public static  boolean digitCount(String num) {
        for(int i=0 ; i<num.length(); i++){
            int count=0;
            for(int j=0; j<num.length(); j++){
                if(num.charAt(j)==(char)(i+48))count++;
            }
            if(num.charAt(i)!=(char)(count+48)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String num = "1210";
        System.out.println(digitCount(num));

    }
}
