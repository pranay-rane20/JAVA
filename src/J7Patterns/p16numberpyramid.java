package J7Patterns;

public class p16numberpyramid {
    public static void main(String[] args) {
        int n = 5;
        int ch =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(ch + " ");

            }
            ch++;
            System.out.println();
        }
    }
}
