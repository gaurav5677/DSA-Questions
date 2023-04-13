package _01.Arrays;

import java.util.Scanner;

public class _05_Sum_Of_Two_Arrays {
    //Let us guide you through the given problem.
    //
    //You are given 2 numbers in the form of arrays.
    //
    //Now we know what mischief must be cooking in your mind. No,
    // converting arrays into numbers and adding them is not possible as the length of arrays can be very lengthy.
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

          int c = 0 ; /// carry
           int i = arr1.length-1;
           int j = arr2.length-1;
           int k = sum.length-1;

           while(k >=0){
               int d = c ; // d = digit caz we will add every number
               if( i >= 0){
                   d += arr1[i];
               }
               if( j >=0){
                   d+=arr2[j];
               }
               c = d/10;  //  new carrya is established
               d = d %10 ;//   new digit is established
               // digit lo choda krrdiya
               sum[k] = d ; // adding into sum array

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
