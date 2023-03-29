package _08_Recursion_with_Arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class _03_Gate_Maze_Paths {
    public static void main(String[] args)  throws Exception{
        Scanner s  = new Scanner(System.in);
        int n  = s.nextInt();
        int m = s.nextInt();
// top letf corner to bottom right corner  indexing start from 1, 1
        ArrayList<String> paths = getMazePaths(1,1, n ,m );
// top left corner to bottom right corner indexing start from 0 , 0
//        ArrayList<String > paths = getMazePaths( 0 , 0 , n-1 ,m -1);
        
    }
   public static ArrayList<String> getMazePaths(int sourceRow , int sourceColoum  ,int destinationRow ,int destinationColoum){


         // base case
       if ( sourceRow == destinationRow  && sourceColoum == destinationColoum){
           ArrayList<String> bres = new ArrayList<>();
           bres.add("");
           return bres;
       }
// horizongtal moves
       ArrayList<String> hpaths = getMazePaths(sourceRow, sourceColoum + 1 , destinationRow, destinationColoum);
// Vertical moves
       ArrayList<String> vpaths = getMazePaths(sourceRow + 1 , sourceColoum, destinationRow, destinationColoum);
// paths

       ArrayList<String> paths = new ArrayList<>();

       // now looping Horizontal paths    and  adding h to each hpaths

       for( String hpath : hpaths){
           paths.add("h" + hpath);
       }

       // loop over vertical paths and adding v to each vpaths
       for(String vpath : vpaths){
           paths.add("v" + vpath);
       }

       return paths;




   }

}



