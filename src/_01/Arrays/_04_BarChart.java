package _01.Arrays;

import java.util.Scanner;

public class _04_BarChart {
    //    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int [] arr = new int[n];
//
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] = s.nextInt();
//
//        }
//
//        for (int i = 0 ; i<arr.length;i++){
//
//
//        }
    public static void main(String[] args) {
        // write code here
        //Let us guide you to the problem. You are given an array of n elements.
        // Each element depicts the height of a vertical bar.
        Scanner s = new Scanner( System.in);
        int n = s.nextInt();
        int [] arr = new int[n];
        for( int i = 0 ; i < arr.length;i++){
            arr[i] = s.nextInt();
        }

        // here we find the maximum  in the Array

        int max = arr[0];
        for( int i = 0 ;  i < arr.length;i++){
            if(arr[i] > max ){
                max = arr[i];
            }
        }
// now we have our max


       for( int floor  = max ; floor >=1 ; floor--){
           // we will start from the max floor and will go till the last floor

          // now we will analyse  every building on floor

           for( int i = 0 ; i<arr.length ; i++){

               if( arr[i] >= floor){
                   // now will check if the current builind is higher that the floor
                   // if yes then we will print the *
                   System.out.print("*\t");


               }else{
                   // if now the will print space
                   System.out.print("\t");
               }
           }
           System.out.println();
       }



    }
}

