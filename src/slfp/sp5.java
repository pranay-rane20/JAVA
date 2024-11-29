package slfp;

public class sp5 {

    public static int m1(int arr[],int key){

        int n = arr.length;
        int beg = 0;
        int end = n-1;
        int index = -1;
        while(beg<=end){
            int mid = (end + beg)/2;
            if(arr[mid]==key){
                index = mid;
                break;
            }
            if(arr[mid]>key){
                end = mid - 1;
            }
            else beg = mid + 1;
        }

        return index;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,9,10,12,14,18,19};
        System.out.println(m1(arr,19  ));
    }
}
