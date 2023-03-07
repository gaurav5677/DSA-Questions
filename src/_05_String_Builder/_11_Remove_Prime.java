package _05_String_Builder;

import java.util.ArrayList;
import java.util.Scanner;

public class _11_Remove_Prime {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        ArrayList<Integer> a1 = new ArrayList<>();

        for( int i = 0 ; i < n ; i++){
            a1.add(s.nextInt());
        }

        solution(a1);
        System.out.println(a1);
    }

    public static boolean isPrime(int val){
        for( int div = 2 ; div * div <= val ; div++){
            if( val % div == 0 ){
                return false ;
            }
        }
        return  true;
    }
    public static void solution(ArrayList<Integer> a1){
        for( int i = a1.size() -1 ; i >=0;i--){
            int val = a1.get(i);
            if( isPrime(val) == true){
                a1.remove(i);
            }
        }
    }
}
