package one.six.zero.days.dsa.string;

import java.util.ArrayList;
import java.util.List;

/*
 * Fizz Buzz Problem involves that given an integer n, for every integer 0 < i <= n, the task is to output,
 * "FizzBuzz" if i is divisible by 3 and 5,
 * "Fizz" if i is divisible by 3,
 * "Buzz" if i is divisible by 5
 * "i" as a string, if none of the conditions are true.
 * Return an array of strings.
 * Constraints:
 * 1 ≤ n ≤ 106
 */
public class FizzBuzz {
	

    public static ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> output = new ArrayList<String>();
        String str ;
        for(int i=1 ; i<=n ; i++){
            str = "";
            if(i%3==0){
                str+="Fizz";
            }
            if(i%5==0){
                str+="Buzz";
            }
            if(str.length()==0){
                str=i+"";
            }
            output.add(str);
        }
        return output;
    }



	public static void main(String[] args) {
		// 1. Create an instance of your FizzBuzzConverter
		FizzBuzz converter = new FizzBuzz();

        // 2. Test Case 1: Small 'n' (e.g., n = 15)
        System.out.println("--- Testing generateFizzBuzz(15) ---");
        List<String> result15 = converter.fizzBuzz(15);
        for (String s : result15) {
            System.out.println(s);
        }
        // Expected output: 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz

        System.out.println("\n--- Testing generateFizzBuzz(5) ---");
        List<String> result5 = converter.fizzBuzz(5);
        System.out.println(result5); // Using toString of List for concise output
        // Expected output: [1, 2, Fizz, 4, Buzz]

        System.out.println("\n--- Testing generateFizzBuzz(3) ---");
        List<String> result3 = converter.fizzBuzz(3);
        System.out.println(result3);
        // Expected output: [1, 2, Fizz]


        System.out.println("\n--- Testing generateFizzBuzz(1) ---");
        List<String> result1 = converter.fizzBuzz(1);
        System.out.println(result1);
        // Expected output: [1]

    }

	

}
