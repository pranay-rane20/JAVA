package slfp;

public class L387 {

    public static int firstUniqChar(String s) {
        int index=-1;
        int[] arr = new int[26];
        // ArrayList<Character> list = new ArrayList<>();
        // for(char ch : s.toCharArray()){
        //     list.add(ch);
        // }
        for(char ch : s.toCharArray()){
            arr[ch-97]++;
        }
        // for(char ch : s.toCharArray()){
        //     if(arr[ch-97]==1)
        // }
        for(int i=0 ; i<s.length() ; i++){
            if(arr[s.charAt(i)-97]==1) {
                index=i;
                break;
            }
        }
        return index;


    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
}
