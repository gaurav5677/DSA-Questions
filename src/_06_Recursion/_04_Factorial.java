package _06_Recursion;

import java.util.Scanner;

public class _04_Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner( System.in);
        int n = s.nextInt();
        int f = factorical (n);
        System.out.println(f);
    }

    public static int factorical(int n ){


        if( n <= 1 ){
            return 1 ;
        }
        int fnm1 = factorical(n -1 );

        int fn = n * fnm1 ;
        return fn;

    }
}
