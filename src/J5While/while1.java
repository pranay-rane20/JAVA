package J5While;

public class while1 {
    public static void main(String[] args) {
       int n=23456;
       int rem;
       while (n>0){
           rem = n%10;
           System.out.print(rem);
           n/=10;
       }
    }
}
