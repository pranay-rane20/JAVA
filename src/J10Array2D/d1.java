package J10Array2D;

import java.util.Scanner;

public class d1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][][] arr = new int[2][2][2][2];
        for(int i = 0; i < arr.length ; i++){
            for(int j = 0 ; j< arr[i].length; j++){
                for(int k = 0 ; k< arr[i][j].length; k++){
                    for(int l = 0 ; l< arr[i][j][k].length; l++){
                        arr[i][j][k][l] = sc.nextInt();

                    }
                }
            }
        }
        for(int i = 0; i < arr.length ; i++){
            for(int j = 0 ; j< arr[i].length; j++){
                for(int k = 0 ; k< arr[i][j].length; k++){
                    for(int l = 0 ; l< arr[i][j][k].length; l++){
                        System.out.print(arr[i][j][k][l] +" ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
