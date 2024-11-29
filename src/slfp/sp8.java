package slfp;

public class sp8 {
    public static void main(String[] args) {
        String s = "aaabcdabcsablkjsdhgjheiu";

        int freq[] = new int[25];
        char ch[] = s.toCharArray();
        for (char chrt : ch){
            freq[chrt-97]++;
        }
        for(int i=0; i<25 ; i++){
            if(freq[i]>0){
                System.out.println((char)(i+97) + " -> " + freq[i]);
            }
        }


    }
}
