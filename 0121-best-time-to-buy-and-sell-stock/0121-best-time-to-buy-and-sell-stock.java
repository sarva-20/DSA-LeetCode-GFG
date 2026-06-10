class Solution {
    public int maxProfit(int[] prices) {
        
        int lowestprice=Integer.MAX_VALUE;
        int maxprofit=0;
        
        int price=0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<lowestprice){
                lowestprice=prices[i];
            }

            int profit=prices[i]-lowestprice;

            if(profit>maxprofit){
                maxprofit=profit;
            }
        }
        return maxprofit;
        
    }
}
// 