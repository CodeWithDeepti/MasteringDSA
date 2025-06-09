package one.six.zero.days.dsa.string;


public class Day17FirstNonRepeatingCharacter {
	
	
	
	    static char nonRepeatingChar(String s) {
	        char firstNonRepeatingChar = '$';
	        int[] VisitedArray = new int[26];
	        
	        for(int i = 0 ; i< VisitedArray.length; i++){
	            VisitedArray[i]=-1;
	        }
	        int index;
	        int count =0 ;
	        for(int i=0; i< s.length(); i++){
	            index=s.charAt(i)-'a';
	            if(VisitedArray[index]>=0){
	                VisitedArray[index]=-2;
	            }else if(VisitedArray[index]!=-2){
	                VisitedArray[index]=count;
	                count++;
	            }
	        }
	        
	        int minPositiveValue = Integer.MAX_VALUE ;
	        int minPositiveIndex = -1;
	        for(int i=0; i< VisitedArray.length ; i++ ){
	            if(VisitedArray[i]>=0  && minPositiveValue > VisitedArray[i] ){
	                minPositiveValue = VisitedArray[i];
	                minPositiveIndex = i;
	            }            
	        }
	        
	        if(minPositiveValue!= Integer.MAX_VALUE){
	            firstNonRepeatingChar = (char)('a'+minPositiveIndex);
	        }
	        
	       
	        return firstNonRepeatingChar;
	    }
	
		/**
	     * Main method to test the findFirstNonRepeatingChar function.
	     * Contains various test cases to verify the function's correctness.
	     */
	    public static void main(String[] args) {
	        // Define test cases: {input_string, expected_output_character}
	        Object[][] testCases = {
	        		{"geeksforgeeks",'f'},
	            {"aabbcdeeff", 'c'},
	            {"leetcode", 'l'},
	            {"aabb", '$'},
	            {"abcdefg", 'a'},
	            {"minimum", 'n'}, // 'n' appears once, 'i' twice, 'm' three times
	            {"", '$'},
	            {"zzzaabbbcdd", 'c'},
	            {"banana", 'b'}, // 'b' is first non-repeating
	           {"mississippi", 'm'}, // 'm' is first non-repeating
	            {"abacaba", 'c'} // 'c' is the only non-repeating character
	        };

	        System.out.println("--- Testing findFirstNonRepeatingChar ---");
	        System.out.println("Expected vs. Actual Output:\n");

	        for (Object[] testCase : testCases) {
	            String inputString = (String) testCase[0];
	            Character expectedOutput = (Character) testCase[1];

	            Character actualOutput = nonRepeatingChar(inputString);

	            String status;
	            if (actualOutput == expectedOutput) { // Handles both char and null comparison
	                status = "PASSED";
	            } else if (actualOutput != null && expectedOutput != null && actualOutput.charValue() == expectedOutput.charValue()) {
	                status = "PASSED"; // For cases where Character objects might differ but values are same
	            }
	            else {
	                status = "FAILED";
	            }


	            // Format output for readability
	            String expectedDisplay = (expectedOutput != null) ? "'" + expectedOutput + "'" : "null";
	            String actualDisplay = (actualOutput != null) ? "'" + actualOutput + "'" : "null";

	            System.out.println("Input:    \"" + inputString + "\"");
	            System.out.println("Expected: " + expectedDisplay);
	            System.out.println("Actual:   " + actualDisplay);
	            System.out.println("Status:   " + status + "\n");
	        }

	        System.out.println("--- Test complete ---");
	    }

	

}
