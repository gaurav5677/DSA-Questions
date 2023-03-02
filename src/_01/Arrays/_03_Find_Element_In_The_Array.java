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
    Scanner s = new Scanner( System.in);
    int n  = s.nextInt();
    int [] arr = new int[n];
    for( int i = 0 ; i<arr.length;i++){
        arr[i] = s.nextInt();
    }

    int data = s.nextInt();
    int idx =  -1;
    for( int i = 0 ; i<arr.length;i++){
        if(arr[i]== data){
            idx = i ;
            break;
        }
    }
    System.out.println(idx);
}
}

