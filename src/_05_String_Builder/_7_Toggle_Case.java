package _05_String_Builder;

import java.util.Scanner;

public class _7_Toggle_Case {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str  =  s.next();
        System.out.println(toggleCase(str));
    }

    public static String toggleCase(String str){
        StringBuilder sb = new StringBuilder(str);

        for( int i =0 ; i < sb.length() ; i++){
            char ch = sb.charAt(i);

            if( ch >= 'a' && ch <='z'){
                char uch = (char)('A' + ch - 'a');
                sb.setCharAt(i, uch);

            }else if( ch >= 'A' && ch <='Z'){
                char lch = (char)('a' + ch - 'A');
                sb.setCharAt(i , lch);
            }
        }
        return sb.toString();

    }
}
