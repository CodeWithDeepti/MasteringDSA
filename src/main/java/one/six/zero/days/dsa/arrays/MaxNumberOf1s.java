package one.six.zero.days.dsa.arrays;

public class MaxNumberOf1s {

	/*
	 * Given a binary array arr[] (containing only 0s and 1s) and an integer k,
	 *  you are allowed to flip at most k 0s to 1s. Find the maximum number of consecutive 1's 
	 *  that can be obtained in the array after performing the operation at most k times.
	 *  
	 *  Constraints:
	 *  1 <= arr.size() <= 105
	 *  0 <= k <= arr.size()
	 *  0 <= arr[i] <= 1
	 */
	
	    // k is the maximum number of zeros allowed to flip
	    public int maxOnes(int arr[], int k) {
	       
	       int leftPointer=0, rightPointer=0;
	       int currentWindowSize=0, maxWindowSize=0;
	       int noOfZeros =0;
	       for( ; rightPointer<arr.length ; rightPointer++){
	           if(arr[rightPointer]==1){
	               currentWindowSize =  rightPointer - leftPointer +1 ;
	               if(maxWindowSize<currentWindowSize){
	                   maxWindowSize=currentWindowSize;
	               }
	           }else{
	               noOfZeros++;
	               if(noOfZeros<=k){
	                   currentWindowSize = rightPointer - leftPointer +1 ;
	                    if(maxWindowSize<currentWindowSize){
	                        maxWindowSize=currentWindowSize;
	                    }
	               }else{
	                   while(noOfZeros>k){
	                       if(arr[leftPointer]==0){
	                            noOfZeros--;   
	                       }
	                       leftPointer++;
	                       currentWindowSize--;
	                   }
	               }
	           }
	           
	       }
	       
	       return maxWindowSize;
	        
	    }
	
	
	public static void main(String[] args) {
		MaxNumberOf1s instance = new MaxNumberOf1s();
		
		 // Test cases
      int[] arr1 = {1, 0, 1}; int k =1;  //Expected 3  
      int[] arr2 = {1, 0, 0, 1, 0, 1, 0, 1};   k = 2; // Expected 5;       
      int[] arr3 = {1, 1};  // Expected 2  
      int[] arr4 = {0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0 } ; k=2; //Expected 15
      
      System.out.println( instance.maxOnes(arr1,k));
      System.out.println( instance.maxOnes(arr2,k));
      System.out.println( instance.maxOnes(arr3,k));
      System.out.println( instance.maxOnes(arr4,k));

	}

}
