package one.six.zero.days.dsa.bitmanipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day157FindOnlyRepetitiveElementfrom1ton1 {

	public static void main(String[] args) throws IOException {
	        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	        int t = Integer.parseInt(read.readLine());
	        while (t-- > 0) {
	            // Read the array from input line
	            String inputLine = read.readLine().trim();
	            String[] inputArr = inputLine.split("\\s+");
	            int n = inputArr.length;
	            int arr[] = new int[n];
	            for (int i = 0; i < n; i++) {
	                arr[i] = Integer.parseInt(inputArr[i]);
	            }

	            Day157FindOnlyRepetitiveElementfrom1ton1 ob = new Day157FindOnlyRepetitiveElementfrom1ton1();
	            System.out.println(ob.findDuplicate(arr));
	            System.out.println("~");
	        }
	    }

			// XOR with itself is 0 and any number XOR with 0 is the number itself 
	    	public int findDuplicate(int[] arr) {
	            int result = arr[0];            
	            for(int i=1 ; i< arr.length; i++){
	                result = result ^ arr[i] ^ i;
	            }
	            return result;
	        }

}
