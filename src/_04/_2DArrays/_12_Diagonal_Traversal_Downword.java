package _04._2DArrays;

import java.util.Scanner;

public class _12_Diagonal_Traversal_Downword {
    public static void main(String[] args) {
        Scanner scn = new Scanner( System.in);
        int n  = scn.nextInt();

        int [] [] arr = new int[n][n];

        for( int i = 0 ; i < arr.length ; i++){
            for( int j = 0 ; j < arr[0].length ; j++){
                arr[i][j] = scn.nextInt();
            }
        }

//         Diagonal Traversal  downward   from the Main diagonal  ( i = 0 , j = 0 )
        for( int g = 0 ; g < arr.length ; g++){
            for( int i = g , j = 0 ; i <arr.length ; i++ , j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
