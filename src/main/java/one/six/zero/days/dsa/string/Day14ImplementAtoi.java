package one.six.zero.days.dsa.string;

import java.util.Arrays;

import one.six.zero.days.dsa.arrays.Day9MinimizetheHeightsII;

public class Day14ImplementAtoi {

	    public int myAtoi(String s) {
	        s=s.trim();
	        
	        int index = 0;
	        // if string is empty then return 0
	        if(s.length()==0){
	            return 0;
	        }
	        
	        // Set sign of the number
	        int sign = 1;
	        if(s.charAt(index)=='+' || s.charAt(index)== '-'){
	            sign =  s.charAt(index)=='-' ? -1 : 1;
	            index++;
	        }
	        
	        //if a digit is found then add it in the number else break the loop 
	        long num = 0; 
	        while(index < s.length()){
	            if(isDigit(s.charAt(index))){
	                num = 10 * num + (s.charAt(index)-'0');
	                index++;
	            }else{
	                break;
	            }
	        }
	        
	        // if sign is negative the multiply the number by -1
	        if(sign == -1){
	            num = (-1) * num;
	        }
	        
	        // if the number is less than MIN_VALUE then return min value
	        if(num <Integer.MIN_VALUE){
	            return Integer.MIN_VALUE ;
	        }
	        
	        //if the number is greater than max value then return max int value
	        if (num > Integer.MAX_VALUE){
	            return Integer.MAX_VALUE;
	        }
	        
	        // type case the number to int and return it
	        return (int)num;
	    }
	    
	    // function to check if the character is a digit or not 
	    boolean isDigit(char ch){
	        if(ch-'0' <0 || ch -'0'>9){
	            return false;
	        }
	        return true;
	    }
	
	
	public static void main(String[] args) {
		Day14ImplementAtoi solver = new Day14ImplementAtoi(); // Create an instance of your Day9MinimizetheHeightsII class
		
		
        // Test Cases
		String str1 = "-123";
        System.out.println("String :" +str1 + " -> Converted to number : " + solver.myAtoi(str1));  // Expected  -123

        str1 = " -";
        System.out.println("String :" +str1 + " -> Converted to number : " + solver.myAtoi(str1)); // Expected  0

        str1 = " 1231231231311133";
        System.out.println("String :" +str1 + " -> Converted to number : " + solver.myAtoi(str1));  // Expected  2147483647
        
        str1 = "-999999999999khksafhkjshfkjdh";
        System.out.println("String :" +str1 + " -> Converted to number : " + solver.myAtoi(str1));   // Expected  -2147483648
      

	}
	
	

}
