//sum of all digits of a number
package J5While;

public class while2 {
    public static void main(String[] args) {
        int n=12345;
        int rem;
        int sum=0;
        while (n>0){
            rem = n%10;
            sum+=rem;
            n/=10;
        }
        System.out.println(sum);
    }
}
