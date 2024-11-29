package slfp;

public class sp9 {
    public static void main(String[] args) {
       String s= "yo|uar|e**|b|e***au|tifu|l";
        int bars=0;
        int star=0;
        for(char ch : s.toCharArray()){
            if(ch == '|')bars++;
            else if (ch=='*' && bars%2==0){
                star++;
            }
        }
        System.out.println(star);
    }
}
