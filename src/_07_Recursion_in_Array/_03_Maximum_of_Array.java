package _07_Recursion_in_Array;

import java.util.Scanner;

public class _03_Maximum_of_Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();

        }
        int max = maxofArray(arr , 0 );
        System.out.println(max);
    }
    public  static int maxofArray(int [] arr , int idx ){
        if( idx == arr.length -1 ){
            return arr[idx ];
        }
        int misa =  maxofArray(arr, idx + 1 );// max in smaller array ;
        if ( misa > arr[idx]){
            return misa;
        }else {
            return arr[idx];
        }
    }
}






