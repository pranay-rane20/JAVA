package J8Array;

//if the array is sorted or not

public class a5 {
    public static void main(String[] args) {

        int arr[] = {1,5,8,9,10,13};

        boolean flag = true;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>=arr[i+1]){
                flag = false;
                break;
            }
        }
        if(flag) System.out.println("yes");
        else System.out.println("no");


    }
}