package _06_Recursion;

import java.util.Scanner;

public class _06_Power_logarithmic_Time_Complexity {
    public static void main(String[] args) {
        Scanner s = new Scanner( System.in);
        int x = s.nextInt();
        int n = s.nextInt();

        int xn = power(x , n );
        System.out.println(xn );
    }
    public static int power(int x , int n ){
        if( n  == 0 ){
            return 1 ;
        }

        int xnpb2 = power( x , n / 2 );
        int xn = xnpb2 * xnpb2;

        if( n % 2 == 1 ){
            xn = xn * x ;
        }
        return xn;
    }
}
