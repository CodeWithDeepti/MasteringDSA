package one.six.zero.days.dsa.arrays;

public class Day3ReverseAnArray {

	/*You are given an array of integers arr[]. Your task is to reverse the given array.

	Note: Modify the array in place.
	
	Constraints:
	1<=arr.size()<=105
	0<=arr[i]<=105
	*/
	
	public static void main(String[] args) {
		

	}
	
	public void reverseArray(int arr[]) {
        int leftPointer = 0, rightPointer= arr.length-1;
        int temp;
        while(leftPointer<rightPointer){
            temp= arr[leftPointer];
            arr[leftPointer]=arr[rightPointer];
            arr[rightPointer]=temp;
            leftPointer++;
            rightPointer--;
        }
        
    }

}
