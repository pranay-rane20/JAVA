package practise;

//a and b are linked together , so find min(a+b,c)


public class ps8 {
    public static void main(String[] args) {
        int A[] = {3,6,4,5,6};
        char B[] = {'a','c','b','b','a'};
        int n = A.length;
        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;
        int c=Integer.MAX_VALUE;

        for(int i =0;i<n;i++){
            if(B[i] == 'a'){
                if(a>A[i]){
                    a=A[i];
                }
            }
            if(B[i] == 'b'){
                if(b>A[i]){
                    b=A[i];
                }
            }
            if(B[i] == 'c'){
                if(c>A[i]){
                    c=A[i];
                }
            }
        }
        System.out.println(Math.min(a+b,c));

    }
}




//for(int i=0;i<n;i++){
//    char ch = B[i];
//    switch (ch) {}
//        case 'a' -> a = Math.min(a,A[i]);
//            case 'b' -> b = Math.min(b,A[i]);
//                    case 'c' -> c = Math.min(c,A[i])
//
//        }
//sout(Math.min(a+b,c));