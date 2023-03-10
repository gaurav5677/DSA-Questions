package _07_Recursion_in_Array;

import java.io.*;
import java.util.*;

public class _06_All_Indices_of_Array {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt((br.readLine()));
        }

        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if (iarr.length == 0) {
            System.out.println();
            return;
        }

        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i]);
        }


    }


    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        // BASE  case
        if (idx == arr.length) {
            return new int[fsf];
        }


        if (arr[idx] == x) {
            int[] iarr = allIndices(arr, x, idx + 1, fsf + 1);
            iarr[fsf] = idx;
            return iarr;

        } else {
            int[] iarr = allIndices(arr, x, idx + 1, fsf);
            return iarr;
        }
    }
}


