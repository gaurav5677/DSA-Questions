package _07_Recursion_in_Array;

import java.util.Scanner;

public class _02_display_Array_In_Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();

        }
        displayArrReverse(arr, 0);
    }
    public static void displayArrReverse(int [] arr , int idx){
        if ( idx == arr.length ){
            return ;

        }
        displayArrReverse(arr, idx + 1 );
        System.out.println(arr[idx]);
    }
}
