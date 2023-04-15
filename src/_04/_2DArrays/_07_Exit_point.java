package _04._2DArrays;

import java.util.Scanner;

public class _07_Exit_point {
    //The problem states that we have a matrix or a 2-D array that has only 1's and 0's as the values inside it. If we
    // encounter a 0 in the matrix we have to keep moving in the direction that we were moving, otherwise, when we encounter
    // 1, we will take a 900 right turn
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        int i = 0;
        int j = 0;
        int dir = 0;   //East->0 South->1 West->2 North->3
        while (true) {
            dir = (dir + arr[i][j]) % 4; //To Keep the values between 0 and 3
            if (dir == 0) {
                j++;  //Move in the same row (east direction)
            } else if (dir == 1) {
                i++;  //Move down the column (south direction)
            } else if (dir == 2) {
                j--;  //Move backwards in the row (west direction)
            } else if (dir == 3) {
                i--;  //Move up the column (north direction)
            }
            /// the below code will check the break point and return the exit point  of i or j
            if (i < 0) {
                i++;  //exit point is one row head (in 0th row)
                break;
            } else if (j < 0) {
                j++;   //exit point is one col ahead (in 0th col)
                break;
            } else if (i == n) {
                i--;  //exit point is one row back (in last row)
                break;
            } else if (j == m) {
                j--;  //exit point is one col back (in last col)
                break;
            }
        }

        System.out.println(i);
        System.out.println(j);

    }
}