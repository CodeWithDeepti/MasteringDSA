package one.six.zero.days.dsa.bitmanipulation;

import java.util.Arrays;
import java.util.Scanner;

/*Given a unsorted array arr[] of positive integers having all the numbers occurring exactly twice,
 *  except for one number which will occur only once. Find the number occurring only once.
 */

public class Day159UniqueNumberI {

	    public static void main(String[] args) throws Exception {
	        Scanner sc = new Scanner(System.in);
	        int t = Integer.parseInt(sc.nextLine());
	        while (t-- > 0) {
	            String[] arr1Str = sc.nextLine().split(" ");
	            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
	            Day159UniqueNumberI ob = new Day159UniqueNumberI();
	            int ans = ob.findUnique(arr);
	            System.out.println(ans);

	            System.out.println("~");
	        }
	    }

	// } Driver Code Ends

	    // Since every number is occurring twice, when we XOR all elements of the array 
	    //it will nullify everything and only number left will be the one that is occuring only once.  
	    public int findUnique(int[] arr) {
	        int result = 0;
	        for(int val:arr){
	            result^=val;
	        }
	        return result;
	    }

}
