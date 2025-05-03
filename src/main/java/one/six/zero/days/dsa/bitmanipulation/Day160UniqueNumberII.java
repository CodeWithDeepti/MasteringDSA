package one.six.zero.days.dsa.bitmanipulation;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/*Given an array arr[] containing 2*n + 2 positive numbers, out of which 2*n numbers exist 
 in pairs whereas only two number occur exactly once and are distinct. Find the other two numbers. 
 Return the answer in increasing order.*/

public class Day160UniqueNumberII {

	    public int[] singleNum(int[] arr) {
	        Map<Integer,Integer> sortedMap = new TreeMap();
	        for(int i=0;i< arr.length ; i++){
	            if(sortedMap.containsKey(arr[i])){
	                sortedMap.remove(arr[i]);
	            }else{
	                sortedMap.put(arr[i],arr[i]);
	            }    
	        }
	        return sortedMap.keySet().stream().mapToInt(Integer::intValue).toArray();
	    }


	    public static void main(String[] args) throws Exception {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int t = Integer.parseInt(br.readLine());
	        while (t-- > 0) {

	            String line = br.readLine();
	            String[] tokens = line.split(" ");

	            // Create an ArrayList to store the integers
	            ArrayList<Integer> array = new ArrayList<>();

	            // Parse the tokens into integers and add to the array
	            for (String token : tokens) {
	                array.add(Integer.parseInt(token));
	            }

	            int[] arr = new int[array.size()];
	            int idx = 0;
	            for (int i : array) arr[idx++] = i;

	            // int k = Integer.parseInt(br.readLine());
	            // Create Solution object and find closest sum
	            Day160UniqueNumberII ob = new Day160UniqueNumberII();
	            int[] ans = ob.singleNum(arr);

	            // Print the result as a space-separated string
	            for (int num : ans) {
	                System.out.print(num + " ");
	            }
	            System.out.println(); // New line after printing the results
	            System.out.println("~");
	        }
	    
	}

}
