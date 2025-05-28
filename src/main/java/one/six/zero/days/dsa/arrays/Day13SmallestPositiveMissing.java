package one.six.zero.days.dsa.arrays;

public class Day13SmallestPositiveMissing {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        int outOfRangeValue = arr.length+1;
        // if the number is less than or equal to zero i.e. 
        // if the number is out of range then change it to n+1
        for(int i=0; i< arr.length ; i++){
            if(arr[i]<=0 ){
                arr[i] = outOfRangeValue;
            }
        }
        
        // for all number(i) with in range make its corresponding index(i-1) negative 
        for(int i=0 ; i<arr.length ; i++){
            if( Math.abs(arr[i]) <= arr.length ){
                arr[Math.abs(arr[i])-1] = (-1)  * Math.abs(arr[Math.abs(arr[i])-1]);
            }
        }
        
        // if any number at index i is still positive that means i+1 number is missing 
        for(int i=0; i< arr.length; i++){
            if(arr[i] > 0){
                return i+1;
            }
        }
        
        return outOfRangeValue;
    }


	public static void main(String[] args) {
		Day13SmallestPositiveMissing instance = new Day13SmallestPositiveMissing();
		
		 // Test cases
       int[] arr1 = {-1, 2, 3, 4, 5, 6, 7, 8}; // Expected: 1
       int[] arr2 = {2, -3, 4, 1, 1, 7};             // Expected: 3
       int[] arr3 = {5, 3, 2, 5, 1};             // Expected: 4
       int[] arr4 = {-8, 0, -1, -4, -3};		// Expected: 1
       
       System.out.println("Max subarray sum for arr1: " + instance.missingNumber(arr1));
       System.out.println("Max subarray sum for arr2: " + instance.missingNumber(arr2));
       System.out.println("Max subarray sum for arr3: " + instance.missingNumber(arr3));
       System.out.println("Max subarray sum for arr3: " + instance.missingNumber(arr4));


	}
	





}


