package _04._2DArrays;

import java.util.Scanner;

public class _11_Diagonal_Traversal {
    public static void main(String[] args) {

        // Input
        Scanner scn = new Scanner( System.in);
        int n  = scn.nextInt();

        int [] [] arr = new int[n][n];

        for( int i = 0 ; i < arr.length ; i++){
            for( int j = 0 ; j < arr[0].length ; j++){
                arr[i][j] = scn.nextInt();
            }
        }


        // Diagonal Traversal  upward  from the Main diagonal  ( i = 0 , j = 0 )
        for( int g = 0 ; g < arr.length ; g++){
            for( int i = g , j = 0 ; i <arr.length ; i++ , j++){
                System.out.println(arr[i][j]);
            }
        }
    }
    
}
