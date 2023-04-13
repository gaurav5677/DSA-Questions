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

    //Find first & last occurrence of 33 in the given array:
    //
    //Array a = {1, 5, 10, 15, 22, 33, 33, 33, 33, 33, 40, 42, 55, 66, 77}.
    //
    //Hence, the answer will be 5 and 9 respectively (0-based indexing).
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int data = s.nextInt();


        // first index
        int low = 0;
        int high  = arr.length - 1;
       int first = -1 ;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (data > arr[mid]) {
                low = mid + 1;
            } else if (data < arr[mid]) {
                high = mid - 1;
            } else {
              first = mid ;
              // we didnt break the code here the below line chechs the further potentinal ans
              high = mid -1 ;
            }
        }
        System.out.println(first);


        // last index
         low = 0;
         high = arr.length - 1;
        int last = -1 ;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (data > arr[mid]) {
                low = mid + 1;
            } else if (data < arr[mid]) {
                high = mid - 1;
            } else {
                last = mid ;
                low = mid + 1 ;
            }  
        }
        System.out.println(last);
    }

}
