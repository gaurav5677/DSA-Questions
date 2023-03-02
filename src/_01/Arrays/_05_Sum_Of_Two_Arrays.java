package _01.Arrays;

import java.util.Scanner;

public class _05_Sum_Of_Two_Arrays {
    public static void main(String[] args) {
        Scanner  s =  new Scanner(System.in);
        int n = s.nextInt();
        int [] arr1 = new int[n];
        for (int i = 0; i < n  ; i++) {
            arr1[i]  = s.nextInt();

        }

        int  m = s.nextInt();
        int [] arr2 = new int [m];

        for (int i = 0; i < m  ; i++) {
            arr2[i]  = s.nextInt();

        }

        int sum[] = new int[n >m ? n : m];

          int c = 0 ;
           int i = arr1.length-1;
           int j = arr2.length-1;
           int k = sum.length-1;

           while(k >=0){
               int d = c ;
               if( i >= 0){
                   d += arr1[i];
               }
               if( j >=0){
                   d+=arr2[j];
               }
               c = d/10;
               d = d %10 ;
               sum[k] = d ;

               i--;
               j--;
               k--;
           }
           if(c!=0){
               System.out.println(c);
           }
           for( int val : sum ){
               System.out.print(val);
           }



    }
}
