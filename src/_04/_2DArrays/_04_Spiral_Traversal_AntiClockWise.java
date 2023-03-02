//1. You are given a number n, representing the number of rows.
//2. You are given a number m, representing the number of columns.
//3. You are given n*m numbers, representing elements of 2d array a.
//4. You are required to traverse and print the contents of the 2d array in form of a spiral.
//Note - Please check the sample output for details.
//Input Format
//A number n
//A number m
//e11
//e12..
//e21
//e22..
//.. n * m number of elements
//Output Format
//e11
//e21
//..
//en1
//en2
//en3
//..
//enm
//e(n-1)m
//..
//e1m
//e1(m-1)
//..
//e12
//e22
//e32
//..
package _04._2DArrays;

import java.util.Scanner;

public class _04_Spiral_Traversal_AntiClockWise {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        //2d array
        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        // lets define the corner of the matrix
        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int tn = n * m;
        int count = 0;

        // Now we will print the matrix in box order
        // first we will print the left wall --> bottom wall --> right wall --> top wall
        // which means we will print in anti clockwise direction

        // loop will run till condition is trur till

        while (count < tn) {
            //left wall
            // in left wall the column is fix only row varries
            for (int i = minr, j = minc; i <= maxr && count < tn; i++) { // count < tn is added here , cause not ever element will surrounded by walls, all the time ; this
                // will print only the last remaining element
                System.out.println(arr[i][j]);

                count++;

            }
            // Avoid printing  dupicate corner element by increasing minc
            minc++;
            //bottom wall
            // in the bottom wall,  row is fixed only column varries
            for (int i = maxr, j = minc; j <= maxc && count < tn; j++) {// count < tn is added here , cause not ever element will surrounded by walls, all the time ; this
                // will print only the last remaining element
                System.out.println(arr[i][j]);

                count++;
            }
            // Avoid printing  dupicate corner element by decreasing maxr
            maxr--;
            // Right wall
            // in Right wall , Column is fix rows varries
            for (int i = maxr, j = maxc; i >= minr && count < tn; i--) {// count < tn is added here , cause not ever element will surrounded by walls, all the time ; this
                // will print only the last remaining element
                System.out.println(arr[i][j]);

                count++;
            }
            // Avoid printing  dupicate corner element by Decreasing maxC
            maxc--;
            // Top wall
            // Row is fix column varries
            for (int i = minr, j = maxc; j >= minc && count < tn; j--) {// count < tn is added here , cause not ever element will surrounded by walls, all the time ; this
                // will print only the last remaining element
                System.out.println(arr[i][j]);

                count++;
            }
            // Avoid printing  dupicate corner element by increasing minr
            minr++;
        }
    }
}
