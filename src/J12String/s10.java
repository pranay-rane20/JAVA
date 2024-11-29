package J12String;

//82- Check Two Strings are Anagram or Not
//Anagrams words have the same word length & same character count
//Examples of anagram words are arc and car, state and taste, night and thing etc.


public class s10 {
    public static void main(String[] args) {
        String s1 = "state";
        String s2 = "tastee";


        int [] s1freq = new int[25];
        for(char ch : s1.toCharArray()){
            s1freq[ch-97]++;
        }
        int [] s2freq = new int[25];
        for(char ch : s2.toCharArray()){
            s2freq[ch-97]++;
        }
        boolean flag = true;

        for(int i=0 ; i<25 ; i++){
            if(s1freq[i]!=s2freq[i]){
                flag=false;
                break;
            }
        }
        if(true) System.out.println("The given two words are Anagram");
        else System.out.println("The given two words are not Anagram");
    }
}
