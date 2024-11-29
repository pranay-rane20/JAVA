package slfp;

public class sp4 {

    public static int maximumWealth(int[][] account){
        int max =0;
        int m= account.length;
        for(int i = 0; i<m ; i++){
            int n = account[i].length;
            int sum = 0;
            for(int j = 0; j<n ; j++){
                sum += account[i][j];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[][] arr= {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };
        System.out.println(maximumWealth(arr));
    }
}
