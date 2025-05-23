package one.six.zero.days.dsa.arrays;
/*Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, 
 * where d is a positive integer. Do the mentioned change in the array in place.

Note: Consider the array as circular.
Constraints:
1 <= arr.size(), d <= 105
0 <= arr[i] <= 105*/

public class Day4RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

    // Function to rotate an array by d elements in counter-clockwise direction.
	    static void rotateArr(int arr[], int d) {
	        int n = arr.length;
	        if(d>n){
	            d= d%n;
	        }
	       reverseArray(arr, 0,d-1);
	       reverseArray(arr,d,n-1);
	       reverseArray(arr,0,n-1);
	    }
	    
	    static void reverseArray(int arr[], int leftPointer, int rightPointer){
	        int temp;
	        while(leftPointer<rightPointer){
	            temp = arr[leftPointer];
	            arr[leftPointer]= arr[rightPointer];
	            arr[rightPointer] = temp;
	            leftPointer++;
	            rightPointer--;
	        }
	    
	}

}
