//fibonacii series
package practise;

public class ps5 {
    public static void main(String[] args) {
        int n=20;
         int a =0;
         int b=1;
        System.out.print(a + " ");
        System.out.print(b + " ");
         for(int i=1; i<=n-2; i++){
             int c =a+b;
             System.out.print(c + " ");
             a = b;
             b = c;

         }

    }
}
