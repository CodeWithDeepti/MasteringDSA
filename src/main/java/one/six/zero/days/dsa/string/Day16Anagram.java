package one.six.zero.days.dsa.string;

public class Day16Anagram {
	
	    // Function is to check whether two strings are anagram of each other or not.
	    public static boolean isAnagram(String s1, String s2) {

	    	// if two strings are of different then it can not be anagram
	        if(s1.length() != s2.length()){
	            return false ; 
	        }
	        
	        // Create a frequency array for string s1
	        int [] frequencyArray= new int[26];
	        for( int i=0 ; i< s1.length() ; i++){
	            frequencyArray[s1.charAt(i)-'a']++;
	        }
	        
	        
	        // start deducting from frequency array if the char exist in s2
	        // any negative occurance means the char occurs more time in s2 then in s1 thus returning false 
	        int index ;
	        for(int i=0 ; i< s2.length() ; i++){
	            index = s2.charAt(i)-'a' ; 
	            frequencyArray[index]--;
	            if(frequencyArray[index] <0){
	                return false;
	            }
	        }
	        
	        return true;
	    }

	public static void main(String[] args) {
		System.out.println("--- Anagram Test Cases ---");

        // Test Case 1: Basic Anagrams
		
		  String test1_s1 = "listen"; String test1_s2 = "silent";
		  System.out.println("'" + test1_s1 + "' and '" + test1_s2 + "' are anagrams: " + isAnagram(test1_s1, test1_s2)); // Expected: true
		 
        // Test Case 2: Different case
        String test2_s1 = "debitcard";
        String test2_s2 = "badcredit";
        System.out.println("'" + test2_s1 + "' and '" + test2_s2 + "' are anagrams: " + isAnagram(test2_s1, test2_s2)); // Expected: true

        // Test Case 3: Not Anagrams (different letters)
        String test3_s1 = "hello";
        String test3_s2 = "world";
        System.out.println("'" + test3_s1 + "' and '" + test3_s2 + "' are anagrams: " + isAnagram(test3_s1, test3_s2)); // Expected: false

        // Test Case 4: Not Anagrams (different length)
        String test4_s1 = "apple";
        String test4_s2 = "aple";
        System.out.println("'" + test4_s1 + "' and '" + test4_s2 + "' are anagrams: " + isAnagram(test4_s1, test4_s2)); // Expected: false

        // Test Case 5: 
        String test5_s1 = "agentleman";
        String test5_s2 = "elegantman";
        System.out.println("'" + test5_s1 + "' and '" + test5_s2 + "' are anagrams: " + isAnagram(test5_s1, test5_s2)); // Expected: true

        // Test Case 6: Single Character
        String test6_s1 = "a";
        String test6_s2 = "b";
        System.out.println("'" + test6_s1 + "' and '" + test6_s2 + "' are anagrams: " + isAnagram(test6_s1, test6_s2)); // Expected: false

        // Test Case 7: 
        String test7_s1 = "a";
        String test7_s2 = "d";
        System.out.println("'" + test7_s1 + "' and '" + test7_s2 + "' are anagrams: " + isAnagram(test7_s1, test7_s2)); // Expected: false

     

	}

}
