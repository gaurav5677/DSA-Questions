package _06_Recursion;

import java.util.Scanner;

public class _00_Decreasing {
    public static void main(String[] args) {
         Scanner s  = new Scanner(System.in);
         int n = s.nextInt();
         printDecreasing(n);
    }

    public static void printDecreasing(int n ){
        if ( n == 0 ){
            return ;

        }
        System.out.println(n);
        printDecreasing(n -1 );
    }
}
