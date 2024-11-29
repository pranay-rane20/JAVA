package J8Array;
//63- Binary Search. If element found print the index else -1

public class a11q63 {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int key = 8;

        int strt=0;
        int end=n-1;
        int index=-1;
        int foundat=-1;

        while(strt<=end){
            int mid=(strt+end)/2;
            if(key==arr[mid]){
               foundat = mid;
               break;
            }
            if(key>arr[mid]){
                strt=mid+1;
            }
            else end = mid-1;
        }
        System.out.println(foundat==-1?"ele not present":"found at " + foundat);




    }
}
