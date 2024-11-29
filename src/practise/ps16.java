package practise;

public class ps16 {
    public static int indexofmax(int[] arr,int n){
        int index =0;
        int max = 0;
        for(int i = 1; i<n ; i++){
            if(max<arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr= {2,3,5,4,1};
        int step =1;
        int index=indexofmax(arr,arr.length);
        while(index!=0){
            index = indexofmax(arr,index);
            step++;
        }
        System.out.println(step);

    }
}
