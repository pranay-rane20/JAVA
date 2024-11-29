package J10Array2D;
//search in a sorted matrix;

import java.util.Arrays;

public class d3 {
    public static void main(String[] args) {

        int nums[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        System.out.println(Arrays.toString(search(nums,12)) );
    }

    static int[] binarys(int[][] mat, int row, int cstrt, int cend , int target ){
        while(cstrt <= cend ){
            int mid = (cstrt+cend)/2;
            if(mat[row][mid]==target) return new int[]{row,mid};
            if(mat[row][mid]<target) cstrt= mid+1;
            else cend = mid-1;
        }
        return new int[]{-1,-1};
    }
    static int[] search (int[][] arr , int target){
        int r=arr.length;
        int c = arr[0].length;

        if(r==1) return binarys(arr,0,0,c-1,target);

        //run the loop till 2 rows are remaining
        int rstrt =0;
        int rend = r-1;
        int cmid = c/2;

        while(rstrt < (rend-1)){
            int mid = (rstrt+rend)/2;
            if(arr[mid][cmid]==target) return new int[]{mid,cmid};
            if(arr[mid][cmid]<target){
                rstrt=mid;
            }
            else{
                rend = mid;
            }
        }

        //now we have two rows
        //check whether the target is in the colums of two rows
        if(arr[rstrt][cmid]==target){
            return new int[]{rstrt,cmid};
        }
        if(arr[rstrt+1][cmid]==target){
            return new int[]{rstrt+1,cmid};
        }
        //seardch in first half
        //search in 2nd half







//        while(r<arr.length && c>=0){
//            if(arr[r][c]==target) return new int[]{r,c};
//            else if (arr[r][c]>target) {
//                c--;
//            }
//            else {
//                r++;
////                c=arr.length-1;
//            }
//        }
        return new int[]{-1,-1};
    }

}
