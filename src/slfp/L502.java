package slfp;

public class L502 {
    public static void main(String[] args) {
        int k=2;
        int w=0;
        int[] profits = {1,2,3};
        int[] capital = {0,1,1};
//        while(k>0){
//            for(int i=0 ; i<capital.length; i++){
//                if(capital[i]==w){
//                    w+=profits[i];
//                    k--;
//                }
//            }
//        }
        while (k > 0) {
            for (int i = 0; i < capital.length - 1;) {
                if (capital[i] == w && capital[i] != capital[i + 1]) {
                    w += profits[i];
                    k--;
                    i++;
                } else if (capital[i] == w && capital[i] == capital[i + 1]) {
                    i++;
                } else
                    i++;
            }
        }
        System.out.println(w);
    }
}
