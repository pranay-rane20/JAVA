package J9Methods;
//strong

public class m2 {

    public  static  int strong (int n){
        int sum =0;
        while(n>0){
            int fact=1;
            int rem = n%10;
            for(int i=1;i<=rem;i++){
                fact *= i;
            }
            sum += fact;
            n/=10;
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(strong(145));
    }
}
