package J12String;
//Accept a string and print the frequency of each character present in the string

public class s9 {
    public static void main(String[] args) {
        String s = "orbhaikyahallchalhai";
        //1
//        for(char ch='a' ; ch<='z' ; ch++){
//            int c=0;
//            for (int i = 0; i < s.length(); i++) {
//                if(ch==s.charAt(i))c++;
//            }
//            if(c>0) System.out.println(ch + " -> " + c);
//        }



        //2
        int [] freq = new int[25];
        for(char ch : s.toCharArray()){
            freq[ch-97]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]>0) {
                System.out.println((char) (i + 97) + " -> " + freq[i]);
            }
        }
    }
}
