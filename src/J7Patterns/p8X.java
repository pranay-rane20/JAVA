package J7Patterns;

public class p8X {
    public static void main(String[] args) {
        int n=5;
         for(int i = 1;i<=5;i++){
             for(int j = 1;j<=5;j++){
                 if(i+j==n+1 || i==j){
                     System.out.print("* ");
                 }
                 else System.out.print("  ");
             }
             System.out.println();
         }
    }
}
