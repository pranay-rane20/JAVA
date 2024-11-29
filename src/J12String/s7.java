package J12String;
//78- Accept a space seperated sentence and split in into words. Print each word
//on a new line with first letter capitalized.
//        IN-      Hello bhai kaise ho
//OP-     Hello
//        Bhai
//        Kaise
//        Ho

import java.util.Arrays;

public class s7 {
    public static void main(String[] args) {
        String s = "Hello bhai kaise ho";
        String []words = s.split(" ");
        System.out.println(Arrays.toString(words));

    }
}
