package J10Array2D;
//the 2d array is sorted by row and column

import java.util.Arrays;

public class d2 {
    public static void main(String[] args) {

        int nums[][] = {{10,20,30,40},
                        {11,25,35,45},
                         {28,29,37,49},
                       {33,34,38,50}};
        System.out.println(Arrays.toString(search(nums,50)) );

        int num[][] = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        System.out.println(Arrays.toString(search(num,12)) );

    }

    static int[] search(int[][] mat,int target){
        int r=0;
        int steps=0;
        int c=mat.length-1;
        while(r<mat.length && c>=0){
            if(mat[r][c]==target)  return new int[]{r,c};
            else if (mat[r][c]<target) r++;
            else c--;
            steps++;
        }
//        System.out.println(steps);
        return new int[]{-1,-1};
    }
}
