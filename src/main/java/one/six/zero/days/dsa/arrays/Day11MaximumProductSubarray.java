package one.six.zero.days.dsa.arrays;

/* Given an array arr[] that contains positive and negative integers (may contain 0 as well). Find the maximum product that we can get in a subarray of arr[].

Note: It is guaranteed that the output fits in a 32-bit integer.

Constraints:
1 ≤ arr.size() ≤ 106
-10  ≤  arr[i]  ≤  10

*/
import java.util.Arrays;

public class Day11MaximumProductSubarray {
	
	// Function to find maximum product subarray
    int maxProduct(int[] arr) {
        
        long leftProduct = 1;
        long rightProduct = 1;
        long maxProduct=Integer.MIN_VALUE;
        
        // Traverse from left to right to find max product
        for(int i= 0; i<arr.length ;i++){
            leftProduct= leftProduct* arr[i];
            if(leftProduct==0){
                leftProduct=arr[i];
            }            
             maxProduct=Math.max(maxProduct,leftProduct);
            
        }
        
     // Traverse from right to left to find max product
         for(int i= arr.length-1; i>=0 ;i--){
              rightProduct= rightProduct* arr[i];
            if(rightProduct==0){
                rightProduct=arr[i];
            }            
            maxProduct=Math.max(maxProduct,rightProduct);
        }
        return (int)maxProduct;
    }


	public static void main(String[] args) {
		Day11MaximumProductSubarray solver = new Day11MaximumProductSubarray(); // Create an instance of your Solution class

        // Test Cases
        int[] nums1 = {2, 3, -2, 4};
        System.out.println("Array: " + Arrays.toString(nums1) + " -> Max Product: " + solver.maxProduct(nums1));

        int[] nums2 = {-2, 0, -1};
        System.out.println("Array: " + Arrays.toString(nums2) + " -> Max Product: " + solver.maxProduct(nums2));

        int[] nums3 = {-2, -3, -1};
        System.out.println("Array: " + Arrays.toString(nums3) + " -> Max Product: " + solver.maxProduct(nums3));

        int[] nums4 = {0};
        System.out.println("Array: " + Arrays.toString(nums4) + " -> Max Product: " + solver.maxProduct(nums4));

        int[] nums5 = {1, 2, -3, 4, -5, 6};
        System.out.println("Array: " + Arrays.toString(nums5) + " -> Max Product: " + solver.maxProduct(nums5));

        int[] nums6 = {-1, 8, 2, -5, 3};
        System.out.println("Array: " + Arrays.toString(nums6) + " -> Max Product: " + solver.maxProduct(nums6));

        int[] nums7 = {0, 0, 0};
        System.out.println("Array: " + Arrays.toString(nums7) + " -> Max Product: " + solver.maxProduct(nums7));

        int[] nums8 = {2, -5, -2, -4, 3};
        System.out.println("Array: " + Arrays.toString(nums8) + " -> Max Product: " + solver.maxProduct(nums8));

        int[] nums9 = {0, -1, 0};
        System.out.println("Array: " + Arrays.toString(nums9) + " -> Max Product: " + solver.maxProduct(nums9));

	}
	
	
	    	

}
