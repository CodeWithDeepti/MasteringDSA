package one.six.zero.days.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class Day6MajorityElementII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	    // Function to find the majority elements in the array
	    public List<Integer> findMajority(int[] nums) {
	        int majElement1=-1,majElement2=-1;
	        int count1=0,count2=0;
	        for(int value : nums){
	        	// Increase count1 if element is equal to majElement1
	            if(value==majElement1){
	                    count1++;
	            }
	            // Increase count2 if element is equal to majElement2
	            else if(value==majElement2){
	                    count2++;
	            }
	            // Assign the value to majElement1 if count1 is zero
	            else if(count1==0){
	                majElement1=value;
	                count1++;
	            }
	            // Assign the value to majElement2 if count2 is zero
	            else if(count2==0){
	                 majElement2=value;
	                count2++;
	            }
	            // otherwise reduce the value of both count1 and count 2
	            else{
	                count1--;
	                count2--;
	            }
	        }
	        count1 =0;
	        count2 =0;
	        // assign the smaller value to majElement1
	        if(majElement1>majElement2){
	            int temp = majElement1;
	            majElement1 = majElement2;
	            majElement2 = temp;
	        }
	        
	        // calculate the count of both majElement1 and majElement2
	        for(int val : nums){
	            if(val==majElement1){
	                count1++;
	            }else if(val == majElement2){
	                count2++;
	            }
	        }
	        
	        
	        List<Integer> output = new ArrayList<>();
	        // if majElement1 is a major element then add it in output 
	        if(count1 > (nums.length/3)){
	            output.add(majElement1);
	        }
	        
	        // if majElement2 is a major element then add it in output 
	        if(count2> (nums.length/3)){
	            output.add(majElement2);
	        }
	        
	        return output;
	        
	    }
	

}
