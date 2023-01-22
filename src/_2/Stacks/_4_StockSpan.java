package _2.Stacks;

import java.util.*;
import java.io.*;

public class _4_StockSpan {

   public static void display(int[] a){                                                  /// for output 
       StringBuilder sb = new StringBuilder();
       for ( int v : a ){
           sb.append(v + "\n");

       }
       System.out.println(sb);
   }
   
   
   
   ////////////////// solution ////////////////////
   
   
    public static  int [] solve (int []arr ){

        int [] span = new int [arr.length];                 

        Stack<Integer> st = new Stack<>();           


        st.push(0);    // here we push 0th element by default                                                  /// same question as the previos one           
        span[0]=1 ;
        for( int i = 1 ; i < arr.length ; i++){
            while(st.size() > 0 && arr[i] >arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                span[i]= i + 1;
            }else{
                span[i] = i - st.peek();

            }
            st.push(i);
        }
        return span;


    }


    public static void main(String[] args)  throws  Exception{                                   
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int n = Integer.parseInt(br.readLine());
        int [] a = new int[n];                                                                           // main
        for(int i = 0 ; i < n ; i++){
            a[i] = Integer.parseInt(br.readLine());

        }
        int [] span = solve(a);
        display(span);




    }
}
