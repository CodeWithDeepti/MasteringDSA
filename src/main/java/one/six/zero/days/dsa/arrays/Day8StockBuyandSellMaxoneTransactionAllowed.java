package one.six.zero.days.dsa.arrays;

/*Given an array prices[] of length n, representing the prices of the stocks on different days. 
 * The task is to find the maximum profit possible by buying and selling the stocks on different days
 *  when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell.
 *  If it is not possible to make a profit then return 0.

Note: Stock must be bought before being sold.

Constraint:
1 <= prices.size()<= 105
0 <= prices[i] <=104

*/
public class Day8StockBuyandSellMaxoneTransactionAllowed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// User function Template for Java


	    public int maximumProfit(int prices[]) {
	        int minBuy = prices[0];
	        int profit = 0, maxProfit =0;
	        
	        for(int i=1; i<prices.length ; i++){
	            
	        	if(prices[i]>minBuy){
	                profit=prices[i]-minBuy;
	                if(profit>maxProfit){
	                    maxProfit=profit;
	                }
	            }else{
	                minBuy=prices[i];
	            }
	        }
	        return maxProfit;
	    }
	

}
