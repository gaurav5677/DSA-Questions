package _04._2DArrays;

//import java.util.Scanner;

import java.util.Scanner;

public class _14_Search_in_Sorted_2dArray {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = s.nextInt();
            }
        }


        int x = s.nextInt();

        int i = 0;
        int j = arr[0].length - 1;


        while( i < arr.length && j >=0){
            if( x == arr[i][j]){   /// equal
                System.out.println(i);
                System.out.println(j);
                return ;
            }else if ( x < arr[i][j]){     // small
                j--;
            }else{      // large
                i++;
            }
        }
        System.out.println("not Found ");
    }


}
