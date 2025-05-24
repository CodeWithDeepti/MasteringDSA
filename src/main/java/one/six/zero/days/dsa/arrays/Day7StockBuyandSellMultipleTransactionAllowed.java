package one.six.zero.days.dsa.arrays;

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
