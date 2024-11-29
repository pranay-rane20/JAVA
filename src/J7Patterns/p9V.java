package J7Patterns;

public class p9V {
    public static void main(String[] args) {
        int n=6;
        for(int i=n;i>=1;i--){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
