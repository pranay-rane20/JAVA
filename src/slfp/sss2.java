package slfp;
import java.awt.*;
import java.io.File;
import java.util.*;
public class sss2 {


    public static void rane(String s, String t) {
        ArrayList<Character> list = new ArrayList<>();
        for (char ch : s.toCharArray()) {
//              map.put(ch,map.getOrDefault(ch,0)+1);
            list.add(ch);
        }
        int count = 0;
            for (char ch : t.toCharArray()) {
                if (!list.contains(ch)) {
//                    return count;
                    break;
                } else {
                    list.remove((Character) ch);
                }
                System.out.println(list);
            }
//        return 0;
    }

    public static void main(String[] args) {
        String s = "ilovecodingonleetcode";
        String t = "code";
//        System.out.println(rane(s,t));
//        rane(s,t);

    }
}
