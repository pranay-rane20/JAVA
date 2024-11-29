package slfp;

public class L557 {

    public static String reversearray(String p){
        String pr = "";
        char chars[] = p.toCharArray();
        int n = chars.length-1;
        for(int i=n; i>=0; i--){
            pr = pr + chars[i];
        }
//        System.out.println(pr);
        return pr;
    }


    public static String reverseWords(String s) {
        String[] p = s.split(" ");
        String res = "";
        for(String word : p){
            word = reversearray(word);
            res = res + word + " ";
//            System.out.println(capitalicebyarray(word));
        }
        res= res.trim();
//        System.out.println(res);

            return res;
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
