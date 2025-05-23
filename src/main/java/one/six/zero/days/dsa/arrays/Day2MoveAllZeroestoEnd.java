package one.six.zero.days.dsa.arrays;

/*You are given an array arr[] of non-negative integers. Your task is to move all the zeros 
 * in the array to the right end while maintaining the relative order of the non-zero elements.
 *  The operation must be performed in place, meaning you should not use extra space for another array.*/

public class Day2MoveAllZeroestoEnd {

	public static void main(String[] args) {


	}
	
	    void pushZerosToEnd(int[] arr) {
	        int slowPointer = 0, fastPointer=0;
	        
	        for( ; fastPointer<arr.length ; fastPointer++ ){
	            if(arr[fastPointer]!=0){
	                arr[slowPointer]=arr[fastPointer];
	                slowPointer++;
	            }
	        }
	        
	        for(;slowPointer<arr.length;slowPointer++ ){
	            arr[slowPointer]=0;
	        }
	        
	    }

}
