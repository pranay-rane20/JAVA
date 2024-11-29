package J8Array;
//62- Linear Search an array - If element found print the index else -1


public class a10q62 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        int index = -1;
        int key=3;
        for(int i=0; i<n;i++){
            if(arr[i]==key){
                index = i;
                break;
            }
        }
        System.out.println(index);

    }
}
