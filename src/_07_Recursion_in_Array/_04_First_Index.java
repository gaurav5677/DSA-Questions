package _07_Recursion_in_Array;

import java.util.Scanner;

public class _04_First_Index {
    public static void main(String[] args) {
        Scanner s = new Scanner( System.in);
        int n = s.nextInt();
        int [] arr =new int[n];

        for( int i = 0; i  < arr.length ; i++){
            arr[i] = s.nextInt();
        }

        int d = s.nextInt();
        int fi = firstIndex(arr, 0 , d );
        System.out.println(fi);
    }

    public static int firstIndex(int [] arr , int idx , int x ){
        if ( idx  == arr.length){
            return -1 ;
        }

        if ( arr[idx] == x ){
            return idx ;

        }else {
            int fiisa = firstIndex(arr , idx + 1 , x );
            return fiisa ;
        }
        // first Index in Small Array


    }
}
