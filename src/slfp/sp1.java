package slfp;

import org.w3c.dom.ls.LSOutput;

public class sp1 {

    public static int m1(int arr[] , int key){
        int index =-1;
        for(int i = 0; i<arr.length ; i++){
            if(arr[i] == key) {
                index = i;
            }
        }
//        System.out.println(index);
        return index;
    }


    public static void main(String[] args) {
        int[] arr = {18,12,9,14,77,50};
        int key = 148;

        System.out.println( m1(arr,key));
    }

}
