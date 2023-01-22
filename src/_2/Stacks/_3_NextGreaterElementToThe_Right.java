package _2.Stacks;

import java.io.*;
import java.util.*;


public class _3_NextGreaterElementToThe_Right {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + " ");
        }


    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int[] nge = solve(a);
        display(nge);

    }

    public static int[] solve(int[] arr) {
        int[] nge = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        st.push(0);  // here i push the address of the first element , not the element  ; 

        for( int i = 1  ; i < arr.length ; i++){
            while(st.size()  > 0 && arr[i] > arr[st.peek()]){ // most imp step arr[i] > arr[st.peek()]  here the peek array element is get compared with the arr [i]
                int pos = st.peek();
                nge[pos] = arr[i];
                st.pop();
            }

            st.push(i);
        }
        while(st.size() > 0 ){
            int pos  = st.peek();
            nge[pos] = -1 ;
          st.pop();
        }

        return  nge ;

//        st.push(arr[arr.length - 1]);
//        nge[arr.length - 1] = -1;
//        for (int i = arr.length - 2; i >= 0; i--) {
//
//            while (st.size() > 0 && arr[i] >= st.peek()) {
//                st.pop();
//            }
//            if (st.size() == 0) {
//                nge[i] = -1;
//            } else {
//                nge[i] = st.peek();
//            }
//            st.push(arr[i]);
//
//        }
//        return nge;
    }
}
