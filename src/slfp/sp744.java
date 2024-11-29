package slfp;

public class sp744 {
    public static void main(String[] args) {
        int[] arr= {2,3,5,9,14,16,18};
        int key = 5;
        int strt=0;
        int end=arr.length-1;
        while(strt<=end){
            int mid = (strt+end)/2;
//            if(arr[mid]==key){
//                strt = mid;
//                break;
//            }
            if(arr[mid]>key){
                end = mid -1;
            }
            else strt = mid+1;
        }
        System.out.println(arr[strt]);
    }
}
