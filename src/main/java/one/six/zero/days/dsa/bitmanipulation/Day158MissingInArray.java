package one.six.zero.days.dsa.bitmanipulation;

//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Day158MissingInArray {
	    public static void main(String[] args) throws Exception {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int t = Integer.parseInt(br.readLine());
	        for (int g = 0; g < t; g++) {
	            String[] str = (br.readLine()).trim().split(" ");
	            int arr[] = new int[str.length];
	            for (int i = 0; i < str.length; i++) {
	                arr[i] = Integer.parseInt(str[i]);
	            }
	            System.out.println(new Day158MissingInArray().missingNum(arr));
	            System.out.println("~");
	        }
	    }
	// } Driver Code Ends

	    // Number when XOR with itself will give 0 and 0 when XOR with a number will give that number only 
	    int missingNum(int arr[]) {
	    	// Initializing the result with first element of the array
	        int result = arr[0];
	        int i=0;
	        for( i=1 ; i< arr.length ;i++){
	            result = result ^ (i) ^ arr[i];
	        }
	        result = result ^ i ^ (i+1);
	        return result;
	}

}
