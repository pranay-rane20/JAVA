package J5While;

public class while3 {
    public static void main(String[] args) {
        int n = 123;
        int sum=0;
        int rem;

        while (n!=0){
            rem = n%10;
            System.out.print(rem);
            sum+=rem;
            n/=10;
            if (n!=0){
                System.out.print("+");
            }
        }
        System.out.println("=" + sum);
    }
}
