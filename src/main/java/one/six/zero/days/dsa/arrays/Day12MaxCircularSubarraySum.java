package one.six.zero.days.dsa.arrays;

import java.util.Arrays;

public class Day12MaxCircularSubarraySum {

		
	    public int circularSubarraySum(int arr[]) {
	        int maxSum=Integer.MIN_VALUE ; 
	        int currentMaxSum=0;
	        int currentMinSum=0;
	        int totalSum =0;
	        int minSum=Integer.MAX_VALUE;
	        
	        //Find the max sum of a subarray
	        for(int i=0; i< arr.length; i++ ){
	              // find the sum of all elements in an array
	            totalSum+=arr[i];
	            
	             //Find the max sum of a subarray
	            currentMaxSum+=arr[i];
	            currentMaxSum = Math.max(currentMaxSum,arr[i]);
	            maxSum=Math.max(currentMaxSum,maxSum);   
	        
	            //Find the min sum of the sub array
	            currentMinSum+=arr[i];
	            currentMinSum= Math.min(currentMinSum,arr[i]);
	            minSum= Math.min(minSum,currentMinSum);
	        }
	        
	        
	        if(minSum == totalSum){
	            return maxSum;
	        }
	   
	        return Math.max(maxSum,totalSum-minSum);
	        
	    }
	
	    public static void main(String[] args) {
	    	Day12MaxCircularSubarraySum solver = new Day12MaxCircularSubarraySum(); // Create an instance of your Solution class

	        // Test Cases
	        int[] nums1 = {2, 3, -2, 4};
	        System.out.println("Array: " + Arrays.toString(nums1) + " -> MAX Circular Subarray Sum: " + solver.circularSubarraySum(nums1));

	        int[] nums2 = {-2, 0, -1};
	        System.out.println("Array: " + Arrays.toString(nums2) + " -> MAX Circular Subarray Sum: " + solver.circularSubarraySum(nums2));

	        int[] nums3 = {-2, -3, -1};
	        System.out.println("Array: " + Arrays.toString(nums3) + " -> MAX Circular Subarray Sum: " + solver.circularSubarraySum(nums3));

	        int[] nums4 = {0};
	        System.out.println("Array: " + Arrays.toString(nums4) + " -> MAX Circular Subarray Sum: " + solver.circularSubarraySum(nums4));

	        int[] nums5 = {1, 2, -3, 4, -5, 6};
	        System.out.println("Array: " + Arrays.toString(nums5) + " -> MAX Circular Subarray Sum: " + solver.circularSubarraySum(nums5));

	        int[] nums6 = {-1, 8, 2, -5, 3};
	        System.out.println("Array: " + Arrays.toString(nums6) + " -> MAX Circular Subarray Sum: " + solver.circularSubarraySum(nums6));

	        int[] nums7 = {0, 0, 0};
	        System.out.println("Array: " + Arrays.toString(nums7) + " -> MAX Circular Subarray Sum: " + solver.circularSubarraySum(nums7));

	        int[] nums8 = {2, -5, -2, -4, 3};
	        System.out.println("Array: " + Arrays.toString(nums8) + " -> MAX Circular Subarray Sum:: " + solver.circularSubarraySum(nums8));

	        int[] nums9 = {0, -1, 0};
	        System.out.println("Array: " + Arrays.toString(nums9) + " -> MAX Circular Subarray Sum:: " + solver.circularSubarraySum(nums9));


		}


}
