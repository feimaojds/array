package leecode;

public class BestTimeToBuyAndSellStock {

	 public int maxProfit(int[] prices) {
		    if(prices.length == 0 ) return 0;
	        int max = 0;
	        int n = prices.length;
	        int sofatMin = prices[0];
	        for(int i=0;i<n;i++){
	        	if(prices[i]>sofatMin){
	        		max = Math.max(max, prices[i]-sofatMin);
	        	}else{
	        		sofatMin = prices[i];
	        	}
	        }
	        return max;
	    }
}
