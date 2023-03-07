package _05_String_Builder;

import java.util.Scanner;

public class _8_String_ith_Difference_Of_Every_Two_Consecutive_Characters {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(solu(str));
    }
    public static String solu(String str){

        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for( int i = 0 ; i < str.length() ; i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i -1 );

            int gap = curr - prev;

            sb.append(gap);
            sb.append(curr);
        }
        return sb.toString();
    }
}
