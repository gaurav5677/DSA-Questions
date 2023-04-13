package _01.Arrays;

import java.util.Scanner;

public class _02_SpanOfArray1 {
//    public static void main(String[] args) {
//        int[] arr = new int[6];
//        arr[0] = 15;
//        arr[1] = 30;
//        arr[2] = 40;
//        arr[3] = 4;
//        arr[4] = 11;
//        arr[5]= 9;
//
//
//        int span ;
//        int smallest = arr[0];
//        int largest = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (smallest >= arr[i]) {
//                smallest = arr[i];
//            }
//            if(largest <=arr[i]){
//                largest = arr[i];
//            }
//
//        }

//        span = largest - smallest;
//        System.out.println(span);
//
//    }


    ///////////////////////////////////// Optimised ////////////////////////
//First of all you will get a number n, which indicates the length of an array. Then you will get n more inputs corresponding to each index of the array.
//
//And you are required to find the span of the array, which is defined as the difference between max and min value of the array.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int [n];

        for( int i = 0 ; i<arr.length;i++){
            arr[i]=s.nextInt();

        }
        // initially max and min are at 0th position of The Array

        // we will chaeck each and every element of the Array to find the min and the max of the array
        // and then we will find the span betweeen the two
        int max  =arr[0];
        int min = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i]< min){
                min = arr[i];
            }


        }
        int span = max -min;
        System.out.println(span);
    }


}

