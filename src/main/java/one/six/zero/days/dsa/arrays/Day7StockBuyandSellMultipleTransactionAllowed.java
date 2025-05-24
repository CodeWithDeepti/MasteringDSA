package one.six.zero.days.dsa.arrays;

/*
 * The cost of stock on each day is given in an array price[]. Each day you may decide to either buy or sell the stock i at price[i], you can even buy and sell the stock on the same day.
 * Find the maximum profit that you can get.

Note: A stock can only be sold if it has been bought previously and multiple stocks cannot be held on any given day.

Constraints:
1 <= prices.size() <= 105
0 <= prices[i] <= 104

 */
public class Day7StockBuyandSellMultipleTransactionAllowed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
    public int maximumProfit(int prices[]) {
        int totalProfit = 0 ;
        int dayProfit=0;
        for(int i=0 ; i< prices.length-1 ; i++){
            // on a given day if there is a profit then add it to total profit
        	dayProfit=prices[i+1]-prices[i];
            if(dayProfit > 0 ){
                totalProfit+=dayProfit;
            }
        }
        return totalProfit;
    }
	

}
