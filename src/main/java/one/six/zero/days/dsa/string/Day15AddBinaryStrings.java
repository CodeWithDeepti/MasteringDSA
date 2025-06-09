package one.six.zero.days.dsa.string;

/*
 * Given two binary strings s1 and s2 consisting of only 0s and 1s. 
 * Find the resultant string after adding the two  * Binary Strings.
 * Note: The input strings may contain leading zeros but the output string should not have any leading zeros.
 * Constraints:
 * 1 ≤s1.size(), s2.size()≤ 106
 */
public class Day15AddBinaryStrings {

	    public static String addBinary(String s1, String s2) {
	        
	        int carry=0;
	        int numberOfOnes = 0;
	        
	        StringBuffer sb = new StringBuffer();
	        
	        int i = s1.length()-1 , j=s2.length()-1;
	        
	        // iterate while both string have some value
	        while(i>=0 || j>=0){
	            numberOfOnes=0;
	            
	            // calculate the total number of ones in s1 s2 at position i and carry 
	            // based on the total number of ones, determine the number in output and in carry 
	            if(i>=0 && s1.charAt(i)=='1')  numberOfOnes++;
	            if(j>=0 && s2.charAt(j)=='1')  numberOfOnes++;
	            
	            numberOfOnes=numberOfOnes+carry;
	            if(numberOfOnes==0){
	                sb.append(0);
	                carry =0;
	            }else if(numberOfOnes ==1){
	                sb.append(1);
	                carry=0;
	            }else if(numberOfOnes==2){
	                sb.append(0);
	                carry=1;
	            }else if(numberOfOnes==3){
	                sb.append(1);
	                carry = 1;
	            }
	            i--; j--;
	        }
	        if(carry==1){
	            sb.append(1);
	        }
	        sb.reverse();
	        
	        // Remove leading zeros if any
	        i=0;
	        while(i<sb.length()){
	            if(sb.charAt(i)=='0'){
	                i++;
	            }else{
	                break;
	            }
	            
	        }
	        return sb.toString().substring(i);
	    
	}
	
	
	public static void main(String[] args) {
		 // Define test cases: {binary_string_1, binary_string_2, expected_output_string}
        Object[][] testCases = {
            {"101", "11", "1000"},       // 5 + 3 = 8
            {"1", "111", "1000"},        // 1 + 7 = 8
            {"1111", "1", "10000"},      // 15 + 1 = 16
            {"10", "1", "11"},           // 2 + 1 = 3
            {"1101", "1011", "11000"},   // 13 + 11 = 24
            {"001", "1", "10"},          // Input with leading zeros, output without (1 + 1 = 2)
            {"010", "001", "11"},        // Input with leading zeros, output without (2 + 1 = 3)
            {"111", "111", "1110"},      // 7 + 7 = 14
            {"1000", "0", "1000"},       // Adding with zero
            {"0", "101", "101"}          // Adding zero
        };

        System.out.println("--- Testing addBinaryStrings ---");
        System.out.println("Expected vs. Actual Output:\n");

        for (Object[] testCase : testCases) {
            String s1 = (String) testCase[0];
            String s2 = (String) testCase[1];
            String expectedOutput = (String) testCase[2];

            String actualOutput = addBinary(s1, s2);

            String status = actualOutput.equals(expectedOutput) ? "PASSED" : "FAILED";

            System.out.println("Input s1: " +s1);
            System.out.println("Input s2: " +s2);
            System.out.println("Expected: " + expectedOutput);
            System.out.println("Actual:   " +actualOutput);
            System.out.println("Status:   "+ status);
            System.out.println();
            
        }

        System.out.println("--- Test complete ---");

	}

}
