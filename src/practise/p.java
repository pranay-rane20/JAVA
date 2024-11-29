package practise;

public class p {
    public static void main(String[] args) {
        int arr[] = { 11,2,3,4,5,66,7,8,4};
        int n = arr.length;
        int max = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
