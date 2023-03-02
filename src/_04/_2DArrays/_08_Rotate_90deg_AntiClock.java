package _04._2DArrays;

import java.util.Scanner;

public class _08_Rotate_90deg_AntiClock {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[][] arr = new int[n][n];
        for( int i = 0 ; i < arr.length;i++){
            for( int j = 0 ; j< arr[0].length;j++){
                arr[i][j] = s.nextInt();
            }
        }

        //Transpose

        /// this will wont work buc swaping happeans 2times on every eleement , resulting origial matrix
//        for( int i  = 0 ; i < arr.length ; i++){
//            for( int j = 0 ;  j <arr[0].length ; j++){
//                int temp = arr[i][j];
//                arr[i][j]=arr[j][i];
//                arr[j][i] = temp;
//            }
//        }
        //Transpose
      for( int i = 0 ; i < arr.length; i++){
          for( int j = i ; j < arr[0].length ; j++){ //loop will run in  upper trangle
              int temp =arr[i][j];
              arr[i][j]=arr[j][i];
              arr[j][i] = temp;
          }
      }

// reverse
      for( int i = 0 ; i < arr.length ; i++){
          int li = 0 ;
            int ri = arr[i].length-1;

            while( li < ri){
                int temp = arr[li][i];
                arr[li][i] = arr[ri][i];
                arr[ri][i]=temp;
                li++;
                ri--;
            }
      }

      display(arr);

    }

    public static void display( int[] [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            }
        }
    }