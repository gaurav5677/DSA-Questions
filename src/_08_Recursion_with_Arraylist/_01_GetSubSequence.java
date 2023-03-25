package _08_Recursion_with_Arraylist;
import  java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class _01_GetSubSequence {
    public static void main(String[] args)  throws Exception{
        Scanner s  = new Scanner(System.in);
        String str = s.next();
        ArrayList<String> res = gss(str); // get subsequence
        System.out.println(res);

    }


       // bc -> [-- , -c , b- , bc ]
       // abc -> [ --- , --c ,-b- , a-- , a-c , ab- , abc ]

    public static ArrayList<String> gss (String str){
       // base case
        // empty stirng have 1 subsequence which is empty " "
        if(str.length() == 0 ){
            ArrayList<String> bres = new ArrayList<>();  // bres == base result
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0); // a alag
        String ros = str.substring(1); // rest of the string alag
        ArrayList<String> rres = gss(ros);  // [-- , -c , b- ,bc ]

        ArrayList<String> mres = new ArrayList<>();  // abc ka result print krrna hain


        for( String val : rres ){
            mres.add("" + val);
        }
        for(String val : rres){
            mres.add(ch + val);
        }
        return mres;
    }
}
