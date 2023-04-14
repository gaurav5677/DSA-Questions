package _04._2DArrays;

import java.util.Scanner;

public class _05_Spiral_Traversal_clockwise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        //2d array
        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = s.nextInt();
            }
        }


        // corners of the matrix
        int minr=0;
        int minc=0;
        int maxr= arr.length-1;
        int maxc = arr[0].length-1;
        int te= n *m ;
        int count = 0 ;
//        ArrayList<Integer> ans = new ArrayList<>();
        //
        while(count < te){
            //top wall
            for( int i = minr , j = minc ; j <= maxc && count < te ; j++){// count < tn is added here , cause not every element will surround by walls, all the time ; this
                // will print only the last remaining element
//                ans.add(matrix[i][j]);
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;
            //right wall
            for(int i = minr  , j = maxc; i <=maxr && count < te;i++ ){// count < tn is added here , cause not every element will surround by walls, all the time ; this
                // will print only the last remaining element
//                ans.add(matrix[i][j]);
                System.out.println(arr[i][j]);

                count++;
            }
            maxc--;
            //bottom wall
            for( int i = maxr , j = maxc ; j >= minc && count < te ; j-- ){// count < tn is added here , cause not every element will surround by walls, all the time ; this
                // will print only the last remaining element
//                ans.add(matrix[i][j]);
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;

            //left wall
            for( int i = maxr  , j = minc ; i  >=minr && count < te ; i--){// count < tn is added here , cause not every element will surround by walls, all the time ; this
                // will print only the last remaining element
//                ans.add(matrix[i][j]);
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;
        }
//        return ans ;
    }
}
