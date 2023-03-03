package _05_String_Builder;

import java.util.Scanner;

public class _03_Print_all_Palindrominc_Substrings {


    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);


            if (c1 != c2) {
                return false;

            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    public static void solution(String str) {

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String ss = str.substring(i, j);

                if (isPalindrome(ss) == true) {
                    System.out.println(ss);
                }

            }

        }

    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.next();
        solution(str);
    }

}

