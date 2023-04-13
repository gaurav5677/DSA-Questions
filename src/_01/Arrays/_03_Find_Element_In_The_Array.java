// first of all you will get a number n, which indicates the length of an array.
// Then you will get n more inputs corresponding to each index of the array.
//After that you will be given one more input, d as data, for which you have to find
// , at which index of array d is present. And in case d is not present in the array then you need to print -1.

package _01.Arrays;

import java.util.Scanner;

public class _03_Find_Element_In_The_Array {
//    public static void main(String[] args) {
//        Scanner  s = new Scanner(System.in);
//        int n = s.nextInt();
//        int [] arr = new int[n];
//
//        for(int i = 0 ; i < arr.length;i++){
//            arr[i] = s.nextInt();
//        }
//
//        int x = s.nextInt();
//        for( int i = 0 ; i< arr.length ; i++){
//            if(arr[i] == x ){
//                System.out.println(i);
//            }
//        }
public static void main(String[] args) {
    // first of all you will get a number n, which indicates the length of an array.
    // Then you will get n more inputs corresponding to each index of the array.
    //After that you will be given one more input, d as data, for which you have to find, at which index of array d is present
    // . And in case d is not present in the array then you need to print -1.

    Scanner s = new Scanner( System.in);
    int n  = s.nextInt();
    int [] arr = new int[n];
    for( int i = 0 ; i<arr.length;i++){
        arr[i] = s.nextInt();
    }

    int data = s.nextInt();
    int idx =  -1; // index at which the data  is present
    for( int i = 0 ; i<arr.length;i++){
        if(arr[i]== data){
            idx = i ;
            break;
        }
    }
    System.out.println(idx);
}
}

