//1. You are given a number n, representing the size of array a.
//        2. You are given n numbers, representing elements of array a.
//
//        Asssumption - Array is sorted. Array may have duplicate values.
//        Input Format
//        A number n
//        n1
//        n2
//        .. n number of elements
//        A number d
//        Output Format
//        A number representing first index
//        A number representing last index

package _01.Arrays;

import java.util.Scanner;

public class _14_First_and_Last_Index {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int data = s.nextInt();

        int l = 0;
        int h = arr.length - 1;
       int f = -1 ;
        while (l <= h) {
            int mid = (l + h) / 2;

            if (data > arr[mid]) {
                l = mid + 1;
            } else if (data < arr[mid]) {
                h = mid - 1;
            } else {
              f = mid ;
              h = mid -1 ;
            }
        }
        System.out.println(f);

         l = 0;
         h = arr.length - 1;
        int li = -1 ;
        while (l <= h) {
            int mid = (l + h) / 2;

            if (data > arr[mid]) {
                l = mid + 1;
            } else if (data < arr[mid]) {
                h = mid - 1;
            } else {
                li = mid ;
                l = mid + 1 ;
            }
        }
        System.out.println(li);
    }

}
