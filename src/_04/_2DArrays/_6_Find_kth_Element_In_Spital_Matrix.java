//package _04._2DArrays;
//
//public class _6_Find_kth_Element_In_Spital_Matrix {
//	public static void main(String[] args) {
//
////
////    public int findK(int a[][], int n, int m, int k)
////// 	{
////
//// 	    // Your code goes here
////
//// 	    int minr =0 ;
//// 	    int minc =0;
//// 	    int maxr = a.length-1;
//// 	    int maxc= a[0].length-1;
////
//// 	    int count = 0 ;
////
//// 	    //top wall
//// 	    while(minr <= maxr && minc <=maxc ){
//// 	    for( int i = minr , j = minc ; j <=maxc   ; j++){
//// 	        count++;
//// 	        if( count == k ){
////
//// 	            return a[i][j];
////
//// 	        }
////
////
//// 	    }
//// 	     minr++;
//// 	    // right wall
//// 	    for ( int i = minr , j = maxc ; i <=maxr  ; i++){
//// 	         count++;
//// 	        if( count == k ){
////
//// 	            return a[i][j];
//// 	        }
////
//// 	    }
//// 	    maxc--;
////
//// 	    // bottom wall
//// 	    for( int i = maxr , j  = maxc ; j >= minc  ; j--){
//// 	         count++;
//// 	        if( count==k){
////
//// 	            return a[i][j];
//// 	        }
//// 	    }
//// 	    maxr--;
////
//// 	    //for left wall
//// 	    for( int i = maxr , j = minc ; i >=minc   ; i-- ){
//// 	        count++;
//// 	        if( count == k ){
////
//// 	            return a[i][j];
//// 	        }
//// 	    }
//// 	    minc++;
////
////
//// 	    }
////
//// 	    return 0 ;
////
////
////
//// 	}
//// 	}
////	 }
////}
