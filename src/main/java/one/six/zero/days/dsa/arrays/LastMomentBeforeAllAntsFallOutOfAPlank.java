package one.six.zero.days.dsa.arrays;

/*
 * We have a wooden plank of the length n units. Some ants are walking on the plank, 
 * each ant moves with a speed of 1 unit per second. Some of the ants move to the left, the other move to the right.
 * When two ants moving in two different directions meet at some point, they change their directions and 
 * continue moving again. Assume changing directions does not take any additional time.
 *  When an ant reaches one end of the plank at a time t, it falls out of the plank immediately.
 *  
 *  Given an integer n and two integer arrays left[] and right[], the positions of the ants moving 
 *  to the left and the right, return the moment when the last ant(s) fall out of the plank.
 *  
 *  1 <= n <= 105
 *  0 <= left.length <= n + 1
 *  0 <= left[i] <= n
 *  0 <= right.length <= n + 1
 *  0 <= right[i] <= n
 *  1 <= left.length + right.length <= n + 1
 *  All values of left and right are unique, and each value can appear only in one of the two arrays.
 */
public class LastMomentBeforeAllAntsFallOutOfAPlank {

		
	    public int getLastMoment(int n, int left[], int right[]) {
	        
	        int maxLeft=0 , minRight=n ; 
	        
	        // find the max in left array
	        for(int i =0; i< left.length ; i++){
	            maxLeft = Math.max(maxLeft,left[i]);
	        }
	    
	        // find the min in right array
	        for(int i =0; i< right.length ; i++){
	            minRight = Math.min(minRight,right[i]);
	        }

	        return Math.max(maxLeft , n-minRight);
	        
	    }
	
	public static void main(String[] args) {
		LastMomentBeforeAllAntsFallOutOfAPlank instance = new LastMomentBeforeAllAntsFallOutOfAPlank();
		int n;
		 // Test cases
     int[] left1 = {4,3}; int[] right1 = {0,1};   n=4;
     System.out.println( instance.getLastMoment(n,left1,right1));  //Expected 4
     
     int[] left2 = {2}; int[] right2 = {0,1,3};   n=4;
     System.out.println( instance.getLastMoment(n,left2,right2));  //Expected 4
     
     int[] left3 = {}; int[] right3 = {0,1,2,3,4};   n=4;
     System.out.println( instance.getLastMoment(n,left3,right3)); //Expected 4
     
     int[] left4 = {0}; int[] right4 = {2};   n=3;
     System.out.println( instance.getLastMoment(n,left4,right4)); //Expected 1
     
     int[] left5 = {3,0,2}; int[] right5 = {4};   n=4;
     System.out.println( instance.getLastMoment(n,left5,right5));  //Expected 3
     
    
	}

}
