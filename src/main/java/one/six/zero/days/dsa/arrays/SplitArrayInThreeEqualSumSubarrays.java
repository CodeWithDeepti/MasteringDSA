package one.six.zero.days.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitArrayInThreeEqualSumSubarrays {

	/*
	 * Given an array, arr[], determine if arr can be split into three consecutive parts such that 
	 * the sum of each part is equal. If possible, return any index pair(i, j) in an array 
	 * such that sum(arr[0..i]) = sum(arr[i+1..j]) = sum(arr[j+1..n-1]), otherwise return an array {-1,-1}.
	 * 
	 * Constraints:
	 * 3 ≤ arr.size() ≤ 106
	 * 0 ≤ arr[i] ≤ 106

	 */
	
	    public List<Integer> findSplit(int[] arr) {
	        //Check if total sum can be divided into 3 parts
	    	int totalSum=0;
	        for(int i = 0 ; i< arr.length ; i++){
	            totalSum += arr[i];
	        }
	        
	        List<Integer> lst = new ArrayList<Integer>();
	        
	        //
	        if(totalSum%3 !=0 ){
	            lst.add(-1);
	            lst.add(-1);
	            return lst;
	        }
	        
	        int requiredSum = totalSum/3;
	        int count=0;
	        int currentSum = 0;
	        for(int i = 0 ; i<arr.length ; i++ ){
	            currentSum+=arr[i];
	            if(currentSum==requiredSum){
	                lst.add(i);
	                currentSum=0;
	                count++;
	                if(count==2){
	                    return lst;
	                }
	            }
	        }
	        
	        return Arrays.asList(-1,-1);
	    }
	
	public static void main(String[] args) {
		SplitArrayInThreeEqualSumSubarrays instance = new SplitArrayInThreeEqualSumSubarrays();
		
		 // Test cases
       int[] arr1 = {1, 3, 4, 1, 2, 1, 5, 3}; 
       int[] arr2 = {1, 2, 3, 2, 5};             
       int[] arr3 = {1, 2, 3, 2 ,1};             
       
       System.out.println( instance.findSplit(arr1));
       System.out.println( instance.findSplit(arr2));
       System.out.println( instance.findSplit(arr3));


	}

}
