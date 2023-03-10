package _07_Recursion_in_Array;

import java.util.Scanner;

public class _01_Display_Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for( int i = 0 ; i < n;i++){
            arr[i] = s.nextInt();
        }

        displayArr(arr , 0 );
    }

    // Expectation -> idx se end tak sab print kar de
    // faint -> idx + 1 se end tak print karna janta hian
    public static void displayArr(int [] arr  , int idx ){
        if ( idx == arr.length){
            return ;
        }
        System.out.println(arr[idx ]);
        displayArr(arr , idx + 1 );
    }
}
