package J13Arraylist;
//Leetcode2210

import java.util.ArrayList;
import java.util.Arrays;

public class Al3 {
    public static void main(String[] args) {
        int[] arr= {2, 4, 1, 1, 6, 5};
        ArrayList<Integer> list = new ArrayList<>();
        for(int e:arr){
            if(!list.contains(e)) list.add(e);
        }
//        System.out.println(list);
        int count=0;
        for(int i=1 ; i<list.size()-1 ; i++){
            if(list.get(i)>list.get(i-1) && list.get(i)>list.get(i+1) || list.get(i)<list.get(i-1) && list.get(i)<list.get(i+1) ) count++;
        }
        System.out.println(count);
    }
}
