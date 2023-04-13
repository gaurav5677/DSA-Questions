package _04._2DArrays;

import java.util.Scanner;

public class _01_Intro_to_2DArray {
    public static void main(String[] args) {

        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();  // rows
        int m  = s.nextInt(); // cols

        int [][] arr = new int[n][m];
        for( int i = 0 ; i < n ; i++){
            for( int j = 0 ; j < m ;j++){
                arr[i][j] = s.nextInt();
            }
        }

        /////////  to  identify the number of rows       arr.length
        /////////   to  identity the number of cols       arr[0].length
        for(int i = 0 ; i <  arr.length;i++){
            for( int  j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
