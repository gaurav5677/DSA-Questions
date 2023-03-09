package _06_Recursion;

import java.util.Scanner;

public class _03_Print_Decreasing_Increasing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        pid(x);
    }

    public static void pid(int x){

        if( x == 0 ){
            return ;
        }
        System.out.println(x);
        pid(x -1 );
        System.out.println(x);
    }
}
