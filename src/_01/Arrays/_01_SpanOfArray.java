package _01.Arrays;

public class _01_SpanOfArray {
//First of all you will get a number n, which indicates the length of an array. Then you will get n more inputs corresponding to each index of the array.
//
//And you are required to find the span of the array, which is defined as the difference between max and min value of the array.


    public static void swap ( int [] arr , int i , int j ){
        int temp = arr[i];
        arr[i ]= arr [j];
        arr[j] =temp;
    }
    public static void main(String[] args) {
        int [] arr = new int [5];
        arr[0]= 20;
        arr[1]= 21;
        arr[2]= 22;
        arr[3]= 23;
        arr[4]= 24;

        swap(arr,0,4);
        System.out.println(arr.length);


        for ( int i = 0 ; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
