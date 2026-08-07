class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int profit=0;
        for(int i=0;i<prices.length-1;i++){
            int highest=prices[i+1];
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]>highest){
                    highest=prices[j];
                }

            }
            if(highest>prices[i]){
                int temp=highest-prices[i];
                profit=Math.max(profit,temp);
            }


        }
        return profit;
        
    }
}
