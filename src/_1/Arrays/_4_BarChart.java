package _1.Arrays;

import java.util.Scanner;

public class _4_BarChart {
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
        Scanner s = new Scanner( System.in);
        int n = s.nextInt();
        int [] arr = new int[n];
        for( int i = 0 ; i < arr.length;i++){
            arr[i] = s.nextInt();
        }

        int max = arr[0];
        for( int i = 0 ;  i < arr.length;i++){
            if(arr[i] > max ){
                max = arr[i];
            }
        }

       for( int floor  = max ; floor >=1 ; floor--){
           for( int i = 0 ; i<arr.length ; i++){
               if( arr[i] >= floor){
                   System.out.print("*\t");

               }else{
                   System.out.print("\t");
               }
           }
           System.out.println();
       }



    }
}

