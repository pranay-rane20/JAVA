package J12String;
//Take an array of strings words and a String Prefix. Print the number of strings
//in words that contain pref as a prefix.
//Example - Input: words = ["pay","attention","practice","attend"], pref = "at"
//Output: 2


public class s5 {
    public static void main(String[] args) {
        String words[] = {"pay","attention","practice","attend"};
        String pref = "at";

        int ans=0;
        for(String word : words){
            if(word.startsWith(pref))ans++;
        }
        System.out.println(ans);
    }
}
