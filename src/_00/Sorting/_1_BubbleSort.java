package _00.Sorting;

import java.io.*;
import java.util.*;

public class _1_BubbleSort {

    public static void bubbleSort(int [] arr ){

        for( int i = 1 ; i <= arr.length -1 ;i++){
            for( int j = 0 ; j < arr.length - i ; j++){
                if( isSmaller(arr , i+1 , j )){
                    swap(arr  , j+1 , j );
                }
            }
        }
    }


    // used for swapping ith and jth elements of array
    public static void swap(int [] arr , int  i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // return true if the ith element is smaller than jth element
    public static boolean isSmaller(int [] arr , int i , int j){
        if(arr[i] < arr[j]){
            return true;
        }
        else {
            return false;
        }
    }



    public static void print(int [] arr ){
        for (int i = 0 ; i  < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int [] arr = new int[n];
        for  ( int i = 0 ; i < n ; i++){
            arr[i] = s.nextInt();
        }

        bubbleSort(arr);
        print(arr);
    }

}
