
//Problem Discussion:
//        You are given an array of size n, you have to print all subsets/subsequences of the array in separate lines. This problem is also known as: printing power set of an array. You can consider that the array elements will be distinct.
//
//        A subsequence/ subset of an array can be formed by choosing some (may be 0, 1, 2, ... or equal to size of array) elements out of all the possible array elements, in the same order in which they appear in the original array.
//
//        Example
//
//        For Array = {10, 20, 30}, there will be 2n (= 23) Subsets/Subsequences:
//
//        - - -
//
//        - - 30
//
//        - 20 -
//
//        - 20 30
//
//        10 - -
//
//        10 - 30
//
//        10 20 -
//
//        10 20 30

package _01.Arrays;

import java.util.Scanner;

public class _11_SubSet_Of_an_Array {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int limit = (int) Math.pow(2, arr.length);
        for (int i = 0; i < limit; i++) {
            // convert i to binary and use 0's and 1's
            String set = "";
            int temp = i ;
            for (int j = arr.length - 1; j >= 0; j--) {
                int r = temp % 2;
                temp = temp / 2;

                if (r == 0) {
                    set = "-\t" + set;
                } else {
                    set = arr[j] + "\t"+  set;
                }
            }

            System.out.println(set);
        }


    }
}
