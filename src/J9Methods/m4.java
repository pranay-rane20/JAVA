package J9Methods;
//formal parameter they do not Affect actual parameter in java


public class m4 {
    public static  void m1(int a[]){
        a[0] = 43;
    }
//    public static void m2(int...a){
//        //vararas
//    }


    public static void main(String[] args) {
        int arr[] = {23};
        System.out.println(arr[0]);
        m1(arr);
//        m2(arr , 1,2,3,4,5);
        System.out.println(arr[0]);
    }
}
