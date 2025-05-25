package one.six.zero.days.dsa.arrays;

/* Given an integer array arr[]. You need to find the maximum sum of a subarray (consecutive numbers).
 * Constraints:
1 ≤ arr.size() ≤ 105
-109 ≤ arr[i] ≤ 104
*/
public class Day10KadanesAlgorithm {

	public static void main(String[] args) {
		
		Day10KadanesAlgorithm instance = new Day10KadanesAlgorithm();
		
		 // Test cases
        int[] arr1 = {-2, -3, 4, -1, -2, 1, 5, -3}; // Expected: 7
        int[] arr2 = {1, 2, 3, -2, 5};             // Expected: 9
        int[] arr3 = {-1, -2, -3, -4};             // Expected: -1
        
        System.out.println("Max subarray sum for arr1: " + instance.maxSubarraySum(arr1));
        System.out.println("Max subarray sum for arr2: " + instance.maxSubarraySum(arr2));
        System.out.println("Max subarray sum for arr3: " + instance.maxSubarraySum(arr3));
    


	}
	
	/**
     * Finds the maximum sum of a contiguous subarray using Kadane's Algorithm.
     * Iterates through the array, maintaining a current sum and a maximum sum.
     * If the current sum becomes non-positive, it's reset to 0.
     * 
     * @param arr The input integer array.
     * @return The maximum subarray sum.
     */

	    int maxSubarraySum(int[] arr) {
	        int maxSum = Integer.MIN_VALUE;  // Stores the overall maximum sum
	        int sum = 0;    // Stores the sum of the current subarray
	        
	        for(int i=0 ; i< arr.length ; i++){
	            sum+=arr[i];
	            if(sum>maxSum){
	                maxSum=sum;
	            }
	            
	            // If current sum is negative, reset it to 0 (start a new subarray)
	            if(sum<=0){
	                sum=0;
	            }
	        }
	        return maxSum;
	    }
	


}
