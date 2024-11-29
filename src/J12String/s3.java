package J12String;
//Count vowels , consonents  and space in a string

public class s3 {
    public static void main(String[] args) {
        String s= "abc d  abcd aiouyt";
        int v=0;
        int c=0;
        int space=0;
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                v++;
            } else if (s.charAt(i)==' ') {
                space++;
            }
            else c++;
        }
        System.out.println("v=" + v);
        System.out.println("c=" + c);
        System.out.println("space=" + space);
    }
}
