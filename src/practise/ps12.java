package practise;

public class ps12 {
    public static void main(String[] args) {
        int []arr = {1,2,1,2,1,3};
        int n = arr.length;
        int leftsum =0;
        int right =0;

        for(int i=0;i<=n/2;i++){
            leftsum += arr[i];
        }
        for(int i=(n/2)+1;i<n;i++){
            right += arr[i];
        }

        System.out.println(Math.abs(leftsum-right));
    }
}
