package one.six.zero.days.dsa.arrays;

import java.util.Arrays;

public class Day9MinimizetheHeightsII {

	    int getMinDiff(int[] arr, int k) {
	        Arrays.sort(arr);
	        int shortest = arr[0], longest = arr[arr.length-1];
	        int answer = longest - shortest;
	        
	        for (int i=1 ; i< arr.length ; i++){
	            
	            // find shortest if pivot point is i
	            shortest = Math.min(arr[0]+k , arr[i]-k);
	            
	            // find longest if pivot point is i
	            longest = Math.max (arr[i-1]+k, arr[arr.length-1] -k);
	            
	            //  if negative then do not count  
	            if(shortest<0 )
	                continue;
	                
	            // calculate the min value of all the answers
	            answer = Math.min (answer, (longest - shortest));
	        }        
	        
	        return answer;
	    }
	

	public static void main(String[] args) {
		Day9MinimizetheHeightsII solver = new Day9MinimizetheHeightsII(); // Create an instance of your Day9MinimizetheHeightsII class

		
        // Test Cases
		int k = 2;
        int[] nums1 = {2, 3, 6, 4};
        System.out.println("Array: " + Arrays.toString(nums1) + " -> Min Height Difference " + solver.getMinDiff(nums1,k));

        int[] nums2 = { 2, 4, 6, 9};
        System.out.println("Array: " + Arrays.toString(nums2) + " -> Min Height Difference " + solver.getMinDiff(nums2,k));

        k=2;
        int[] nums3 = {1, 5, 8, 10};
        System.out.println("Array: " + Arrays.toString(nums3) + " -> Min Height Difference " + solver.getMinDiff(nums3,k));

        k=3;
        int[] nums4 = {3, 9, 12, 16, 20};
        System.out.println("Array: " + Arrays.toString(nums4) + " -> Min Height Difference " + solver.getMinDiff(nums4,k));

        k=6;
        int[] nums5 = {1, 2, 3};
        System.out.println("Array: " + Arrays.toString(nums5) + " -> Min Height Difference " + solver.getMinDiff(nums5,k));

	}

}
