package practise;
import java.util.Arrays;
//

public class ps9 {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        int n = arr.length;
        int one = arr[0]*arr[1];
        int last = arr[n-1]*arr[n-2];
        int narr[] = new int[n];
        for(int i=1;i<n-1;i++){
            narr[i] = arr[i-1]*arr[i+1];
        }
        narr[0] = one;
        narr[n-1]=last;
        System.out.println(Arrays.toString(narr));
    }
}
