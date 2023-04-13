package _01.Arrays;

import java.util.Scanner;

public class _06_Different_of_Two_Array {
    //We will be given two numbers in the form of arrays and we will need to calculate the difference.
    // It is also specified that the second number will always be greater than the first one.
    // (This makes it easy for us, but I will advise you to try to approach
    // the problem without this assumption after you are able to understand this particular problem).
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        ///////Array 1 is
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = scn.nextInt();

        }
        ////////Array 2
        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = scn.nextInt();

        }
         // n2 is bigger than n1
        int[] diff = new int[n2];
        int c = 0;

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = diff.length - 1;


        while (k >= 0) {

            int d = 0;
            int a1v = i >= 0  ? a1[i] : 0 ; //a1v = a1 ki value

            if (a2[j] + c >= a1v ){
                d = a2[j] + c - a1v;
                c = 0;
            } else {

                d = a2[j] + c + 10 - a1v;
                c = -1;

            }

            diff [k] = d ;
            i--;
            j--;
            k--;

        }
       int idx = 0 ;
        while (idx < diff.length){
            if(diff[idx] == 0 ){
                idx++;
            }else{
                break;
            }
        }
        while(idx < diff.length){
            System.out.println(diff[idx]);
            idx++;
        }

    }
}
