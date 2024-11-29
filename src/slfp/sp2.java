package slfp;

public class sp2 {
    public static int minnum(int a[]){
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i]<min){
                min = a[i];
            }
        }
        return min;

    }


    public static void main(String[] args) {
        int[] arr = {24,3,65,76,3876,767};
        System.out.println(minnum(arr));
    }
}
