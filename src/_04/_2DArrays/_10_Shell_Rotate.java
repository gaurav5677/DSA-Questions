package _04._2DArrays;

import java.util.Scanner;

public class _10_Shell_Rotate {
    public static void main(String[] args) {
        //INPut

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
              }
        }

        int sh = s.nextInt();   // shell
        int r = s.nextInt();// rotate
        rotateShell(arr, sh, r);
        display(arr);


    }


    public static void rotateShell(int[][] arr, int s, int r) {
        int[] oned = fillOneDFromtShell(arr, s);  // this will give you onc d array
        rotate(oned, r);
        fillShellFronOned(arr, s, oned);
    }


    public static int[] fillOneDFromtShell(int[][] arr, int s) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;
        int sz = 2 * (maxr - minr + maxc - minc);

        int[] oned = new int[sz];

        // lw
        int idx = 0;
        for (int i = minr, j = minc; i < maxr; i++) {
            oned[idx] = arr[i][j];
            idx++;
        }
        // bw

        for (int i = maxr, j = minc + 1; i <= maxc; j++) {
            oned[idx] = arr[i][j];
            idx++;
        }
        // rw

        for (int i = maxc - 1, j = maxc; i >= minr; i--) {
            oned[idx] = arr[i][j];
            idx++;
        }
        // lw

        for (int i = minr, j = maxc - 1; j >= minc; j--) {
            oned[idx] = arr[i][j];
            idx++;
        }
        return oned;
    }


    public static void fillShellFronOned(int[][] arr, int s, int[] oned) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;
//        int sz = 2  * (maxr - minr + maxc - minc);

//        int [] oned = new int[sz];

        // lw
        int idx = 0;
        for (int i = minr, j = minc; i < maxr; i++) {
            arr[i][j] = oned[idx];
            idx++;
        }
        // bw

        for (int i = maxr, j = minc + 1; i <= maxc; j++) {
            arr[i][j] = oned[idx];
            idx++;
        }
        // rw

        for (int i = maxc - 1, j = maxc; i >= minr; i--) {
            arr[i][j] = oned[idx];
            idx++;
        }
        // lw

        for (int i = minr, j = maxc - 1; j >= minc; j--) {
            arr[i][j] = oned[idx];
            idx++;
        }
//        return oned;
    }

    public static void rotate(int[] oned, int r) {
        r = r % oned.length;
        if (r < 0) {
            r = r + oned.length;
        }

        reverse(oned, 0, oned.length - r - 1);
        reverse(oned, oned.length - r, oned.length - 1);
        reverse(oned, 0, oned.length - 1);


    }

    public static void reverse(int[] oned, int i, int j) {
        while (i < j) {  // left right
            int temp = oned[i];
            oned[i] = oned[j];
            oned[j] = temp;

            i++;
            j--;
        }
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
