package _04._2DArrays;

import java.util.Scanner;

public class _7_Exit_point {
    public static void main(String[] args) {
        Scanner s = new Scanner( System.in);
        int n  = s.nextInt();
        int m  = s.nextInt();

        int [] [] arr = new int[n][m];

        for( int i = 0 ; i < arr.length ; i++){
            for( int j = 0 ; j < arr[0].length;j++){
                arr[i][j]=s.nextInt();
            }
        }

         int dir  = 0 ;     //0 == east , 1 = south , 2 = west , 3 = north
         int i = 0 ; // entry point;
         int j = 0 ; // enty point;

        while(true){
               dir = ( dir + arr[i][j]) %4 ;
            if(dir ==  0 ){ // East
                j++;
            }else if( dir ==1  ){ // South
                i++;
            }else if (dir ==2 ){ // west
                j--;
            }else if (dir==3  ){ // North
                i--;
            }

            if( i < 0 ){
                i++;
                break;

            }else if (j < 0){
                j++;
                break;
            }
            else if ( i ==arr.length){
                i--;
                break;
            }else if ( j == arr[0].length){
                j--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }

}
