//In a country of novice government, the economic system is changed where only coins are used that too of various denominations. Whenever a foreigner visits this country, they visit a money exchanger to get the currency of the same country. As the foreigner is unaware of the denomination of the country, the money exchange prefers to tell them the denomination which is the nearest maximum and nearest minimum to the denomination mentioned by the foreigner. In case they get the correct guess of the denomination, they are told the same denomination. The denominations are always quoted in ascending order.
//
//        Example 1: In a country, 8 given denominations are as follows
//        [5, 10, 15, 22, 33, 40, 42, 55]
//
//        The foreigner asks for denomination 25.
//        The money exchange tells them that denominations of 33 and 22 are available.
//
//        Example 2:
//        In a country, 5 given denominations are as follows
//        [7, 14, 18, 25, 30]
//
//        The foreigner asks for the denomination of 18.
//
//        The money exchange tells them a denomination of 18 is available.
//
//        You are required to print the values told by the money exchange to the foreigner.
//
//        1. You are given a number n, representing the size of array a.
//        2. You are given n numbers, representing elements of the array a.
//        3. You are given another number d.
//        4. You are required to find the ceil and floor of d in array a.

package _01.Arrays;

import java.util.Scanner;

public class _13_BrokenEconomy {
    //IIf we take a look at the question, we are essentially required to find the ceil and floor values of the given data, say "d", in a sorted array of n elements.
    //
    //Now you may ask, what the hell are these ceil and floor values!? No need to be hostile , my friend. Read further.
    //
    //Ceil value is the least integer that is greater or equal to the given data .Or, ceil value is the smallest of the elements greater than or equal to the given data "d".
    //
    //Likewise floor value is the greatest integer that is less than or equal to x. Or, floor value is the largest of the elements smaller than or equal to the given data "d".
    //
    //It's totally possible that you might not have understood their meaning entirely ,so let's discuss a few examples.

    //Let's discuss the strategy to find the ceil and floor values of d=33. Pay close attention to it !
    //
    //First, we initialize floor value as -8 and ceil value as +8. Also, "lo" is initialized as 0 and "hi" as arr.length-1, as we have already examined in the Binary Search Algorithm.
    //
    //Then, by the Binary Search algorithm, mid =4 of value 50. Since 33<50, therefore hi=mid-1= 3 .Hence, we set the ceil as the mid value 50.
    //Now , for lo=0 and hi=3, mid=1 of value 20. Since 33>20, therefore lo=mid+1=2. Hence, we set the floor as the mid value 20.
    //By now, lo=2 and hi=3 , so mid =2 of value 30 , Since 33>30, therefore lo=mid+1=3. Hence, we set the floor as the mid value 30.
    //Now, since lo and hi both are at index 3, so mid=3 of value 40.Since,33<40, therefore hi=mid-1= 2 .Hence, we set the ceil as the mid value 40.
    //Since lo and hi have crossed each other, we'll terminate the loop and return the values of ceil and floor.
    //We highly request
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n   = s.nextInt();

        int [] arr = new int[n];

        for( int i = 0 ; i < arr.length ; i++){
            arr[i] = s.nextInt();
        }

        int data = s.nextInt();
         int low = 0 ;
         int high  = arr.length-1;
        int ceil = 0 ;
        int floor  = 0 ;
         while( low <=high){
             int mid = (low + high ) /2 ;

             if( data < arr[mid]){

                 high = mid -1 ;
                 ceil =  arr[mid];

             }else if ( data > arr[mid]){
                   low = mid + 1 ;
                   floor = arr[mid];

             }else{
                 ceil =  arr[mid];
                 floor = arr[mid];
                 break ;


             }
         }

        System.out.println( ceil);
        System.out.println( floor);


    }
}
