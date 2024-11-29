package J12String;
//Toggle each alphabet of String
//In - AcgDfD Output - aCGdFd

public class s4 {
    public static void main(String[] args) {
        String s = "AcgDPrfD";
        String res = "";
//        for(int i=0 ; i<s.length()-1 ; i++){
//            if()
//        }
        for(char ch:s.toCharArray()){
            res = res + ((ch >='a' && ch<='z') ? (char)(ch-32) : (char)(ch+32));
        }
        System.out.println(res);
    }
}
