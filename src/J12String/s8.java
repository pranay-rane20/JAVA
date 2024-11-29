package J12String;
//
//78- Accept a space seperated sentence and split in into words. Print each word
//on a new line with first letter capitalized.
//        IN-      Hello bhai kaise ho
//OP-     Hello
//        Bhai
//Kaise
//        Ho
//79- Extend the prev question and capitalize first & last character of each word
//in the sentence and print the new sentence
//Ex - 	Hello bhai Kaise ho a
//HellO BhaI KaisE HO A


public class s8 {
    //78->full sentence ......1st alpha to uppercase
    public static String capitalice(String word){
        char first = word.charAt(0);
        String second = word.substring(1);
        return Character.toUpperCase(first) + second;
    }
    //79->full sentence ....1st and last alpha to uppercase
    public static String capitalicebyarray(String word){
        if(word.length()<=2) return word.toUpperCase();
        char chars[] = word.toCharArray();
        int n=chars.length;
        chars[0] = Character.toUpperCase(chars[0]);
        chars[n-1]= Character.toUpperCase(chars[n-1]);
        return new String(chars);
        
    }
    public static void main(String[] args) {
        String s = "or bhai kya haal chal h";
        String res = "";
        String[] words = s.split(" ");
        for(String word : words){
            word = capitalicebyarray(word);
            res = res + word + " ";
//            System.out.println(capitalicebyarray(word));
        }
        res= res.trim();
        System.out.println(res);
    }
}
