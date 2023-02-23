package _04._2DArrays;

import java.util.Scanner;

public class _9_Rotate_90Deg_Clockwise {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        // Transpose
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Reverse

        for (int i = 0; i < arr.length; i++) {
            int li = 0;  // left index
            int ri = arr[i].length - 1; // right index

            while (li < ri) {
                int temp = arr[i][li];
                arr[li][i] = arr[i][ri];
                arr[ri][i] = temp;

                li++;
                ri--;
            }
        }
        display(arr);
    }
    public static void display( int[] [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


