package _01.Arrays;
import java.util.*;
//import java.io.*;

public class _10_subArrays_of_anArray {
//For example, the sub-arrays of the array {1, 2, 3} are {1}, {1, 2}, {1, 2, 3}, {2}, {2, 3}, and {3}.
// We need to print these sub-arrays on different lines and also there should be a tab space in between the printed sub-array sequences,

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
                for( int k = i ; k <=j ; k++){   // loop for printing the elements betweet i and j
                    System.out.print(arr[k] + "\t" );

                }
                System.out.println();
            }
        }


    }
}
