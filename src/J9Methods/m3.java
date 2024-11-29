package J9Methods;

public class m3 {
    public static int special(int a){         //formal parameters
        int sum =0;
        while(a!=0){
            int rem = a%10;
            sum += rem;
            a/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n =109;
        while(n>9){
            n = special(n);      //actual  parameters
        }
        System.out.println(n==1?"special":"not special");

    }
}
