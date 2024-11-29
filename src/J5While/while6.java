package J5While;

public class while6 {
    public static void main(String[] args) {
        int n = 145;
        int arm = n;
        int rem;
        int sum=0;
        while (n!=0){
            rem = n%10;
            int fac = 1;
            for(int i = 1;i<=rem ; i++){
                fac*=i;
            }
            sum+=fac;
            n/=10;
        }
        System.out.println(sum);
        if(arm == sum){
            System.out.println("yes , it is a armstrong number");
        }
        else{
            System.out.println("not a armstrong number");
        }
    }
}
