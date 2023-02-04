package _01.Arrays;
import java.util.*;
//import java.io.*;

public class _10_subArrays_of_anArray {


    /////////////                abcd
    /////////////      a
    /////////////      ab
    /////////////      abc
    /////////////      abcd
    /////////////      b
    /////////////      bc
    /////////////      bcd
    /////////////      c
    /////////////      cd

    public static void main(String[] args) {
        Scanner s = new Scanner( System.in);
        int n = s.nextInt();

        int [] arr = new int [n];
        for( int i = 0 ; i  < arr.length ; i++){
            arr[i] = s.nextInt();
        }

        for( int i =0 ; i < arr.length ; i++){
            for( int  j = i ; j < arr.length ; j++ ){
                for( int k = i ; k <=j ; k++){
                    System.out.print(arr[k] + "\t" );

                }
                System.out.println();
            }
        }


    }
}
