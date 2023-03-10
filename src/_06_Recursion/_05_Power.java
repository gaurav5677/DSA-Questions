package _06_Recursion;

import java.util.Scanner;

public class _05_Power {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        int xn = pow(x , n );
        System.out.println(xn);
    }

    public static int pow(int  x , int  n ){

        if ( n ==0 ){
            return 1 ;
        }
        int xnm1 = pow(x , n -1 );
        int xn = x * xnm1;

        return xn ;
    }
}
