package _01.Arrays;
import java.io.*;
//import java.util.*;
public class _09_Inverse_of_AnArray {

    //In this problem you are given a number n, representing the size of array a, followed by n numbers, representing elements of array a.
    //
    //You are required to calculate the inverse of array a. Since input and output are already managed, your only work is to code a function that will return the user a new array with inverted values.
    //
    //It is important to mention to you that constraints on the values of input array, is that the values should be between 0 and n (length of input array), with no repetition so that value at each index is unique. It is because when you are inverting the array there are no 2 different values for one index and also leaving one or more index null.
    //
    //Example: Suppose, value 2 is present at index 3 in the input array so in our result array, at index 2 the value should be 3.


    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }
 /////////// ans ///////////////////
    public static int[] inverse(int[] a){
        // write your code here

        int [] inv = new int [a.length];
        for( int i  =  0; i < a.length ; i++){
            int v = a[i];
            inv [v] = i ;
        }
        return null;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] inv = inverse(a);
        display(inv);
    }

}