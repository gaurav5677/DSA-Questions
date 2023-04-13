//1. You are given a number n1, representing the number of rows of 1st matrix.
//2. You are given a number m1, representing the number of columns of 1st matrix.
//3. You are given n1*m1 numbers, representing elements of 2d array a1.
//4. You are given a number n2, representing the number of rows of 2nd matrix.
//5. You are given a number m2, representing the number of columns of 2nd matrix.
//6. You are given n2*m2 numbers, representing elements of 2d array a2.
//7. If the two arrays representing two matrices of dimensions n1 * m1 and n2 * m2 can be multiplied, display the contents of prd array as specified in output Format.
//8. If the two arrays can't be multiplied, print "Invalid input".
//Input Format
//A number n1
//A number m1
//e11
//e12..
//e21
//e22..
//.. n1 * m1 number of elements of array a1
//A number n2
//A number m2
//e11'
//e12'..
//e21'
//e22'..
//.. n2 * m2 number of elements of array a2
//Output Format
//e11' e12' e13' ..
//e21' e22' e23' ..
//.. elements of prd array

package _04._2DArrays;

import java.util.Scanner;

public class _02_Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int r1 = s.nextInt();
        int c1 = s.nextInt();

        int[][] one = new int[r1][c1];
        for (int i = 0; i < one.length; i++) {   // rows
            for (int j = 0; j < one[0].length; j++) { // cols
                 one[i][j] = s.nextInt();
            }
        }
        int r2 = s.nextInt();
        int c2 = s.nextInt();

        int[][] two = new int[r2][c2];
        for (int i = 0; i < two.length; i++) {        /// rows
            for (int j = 0; j < two[0].length; j++) {      //// cols
                two[i][j] = s.nextInt();
            }
        }

        // 2 x 3     3 x 4  //
        //r1 x c1  r2 x c2 //
        if (c1 != r2) {
            System.out.println("Invalid input");
            return;
        }
        int[][] pro = new int[r1][c2];
        for (int i = 0; i < pro.length; i++) {
            for (int j = 0; j < pro[0].length; j++) {
                for (int k = 0; k < c1; k++) { // common dimention         //c1 == r2    for( int k =0 ; k < r2 ; k++) this is also valid
                    pro[i][j] += one[i][k] * two[k][j];  // ith and the jth element is comman only kth element varryies
                   // C23 = A21  * B13 + A22 * B23  + A23 * B33
                }
            }
        }
        for (int i = 0; i < pro.length; i++) {
            for (int j = 0; j < pro[0].length; j++) {
                System.out.print(pro[i][j] + " ");
            }
            System.out.println();
        }

    }
}
