package Arrays;

public class SpanOfArray {
    public static void main(String[] args) {
        int [] arr = new int [5];
        arr[0]= 20;
        arr[1]= 21;
        arr[2]= 22;
        arr[3]= 23;
        arr[4]= 24;

        System.out.println(arr.length);

        for ( int i = 0 ; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
