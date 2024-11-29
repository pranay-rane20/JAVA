package practise;

import java.util.Arrays;

public class ps10 {
    public static void main(String[] args) {
       int []arr = {1,1,2,1,3,2,4,3,4,3,2};
       int key =1;
       int n = arr.length;
       for(int i=0;i<n;i++){
           int count =1;
           if (arr[i] != -1){
           for(int j=i+1;j<n;j++){
               if(arr[i]==arr[j]) {
                           count++;
                           arr[j] = -1;
                       }

               }
           }
           System.out.println(arr[i] + " occured " + count + " times");

       }
    }
}
