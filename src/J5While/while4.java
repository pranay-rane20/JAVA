//reverse
package J5While;

public class while4 {
    public static void main(String[] args) {
        int n = 123;
        int rev = 0;
        int rem;
        while (n!=0){
            rem = n%10;
            rev = rev*10 + rem;
            n/=10;
        }
        System.out.println(rev);
    }
}
