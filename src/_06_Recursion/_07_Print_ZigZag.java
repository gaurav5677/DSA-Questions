package _06_Recursion;

import java.util.Scanner;

public class _07_Print_ZigZag {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        pzz(n);
    }

    public static void pzz(int n) {
        if (n == 0) {
            return;
        }


        System.out.println(n);
        pzz(n - 1);
        System.out.println(n);
        pzz(n - 1);
        System.out.println(n);
    }
}
