package one.six.zero.days.dsa.arrays;

/*Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.

*Constraints:
2 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 105
*/

public class Day1SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int getSecondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1;
        for(int value : arr){
            if(value > largest){
                secondLargest=largest;
                largest=value;
            }else if(value < largest && value>secondLargest){
                secondLargest=value;
            }
        }
        return secondLargest;   
    }

}
