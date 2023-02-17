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
