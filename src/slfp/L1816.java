package slfp;

public class L1816 {

    public static String truncateSentence(String s, int k) {
        String word[] = s.split(" ");
        String res = "";
        for(int i=0 ; i<k ; i++){
            res = res + word[i] ;
            res = res + " ";
        }
        res = res.trim();
        return res;
    }

    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k=4;
        System.out.println(truncateSentence(s,k));

    }
}
