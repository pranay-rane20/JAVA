//palimdrome
package J5While;

public class while5 {
    public static void main(String[] args) {

        int n = 12321;
        int palim =n ;
        int rev = 0;
        int rem;
        while (n!=0){
            rem = n%10;
            rev = rev*10 + rem;
            n/=10;
        }

//        System.out.println(rev);
        if(rev == palim){
            System.out.println("The given number is a palimdrome number");
        }
        else {
            System.out.println("not a palimdrome number");
        }


    }
}
