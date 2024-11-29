package slfp;

import java.util.ArrayList;

public class L2042 {
    public static void main(String[] args) {
          String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        System.out.println(areNumbersAscending(s));
    }

    public static boolean areNumbersAscending(String s) {

        String words[] =  s.split(" ");
        ArrayList<String> letter = new ArrayList<>();

        for(String word : words){
            if(number(word)) letter.add(word);
        }

        ArrayList<Integer> nums = new ArrayList<>();
        for(String i : letter) nums.add(Integer.parseInt(i));
        System.out.println(nums);

        for(int i=0; i<nums.size()-1; i++){
            System.out.println(nums.get(i));
            System.out.println(nums.get(i+1));
            if(nums.get(i)>=nums.get(i+1))
                return false;
        }
        return true;
    }

    public static boolean number(String n){
        if(n.charAt(0) >= 48 && n.charAt(0) <= 57)return true;
        else return false;
    }

}
