class Solution {
    public int maxProfit(int[] prices) {
        
        int minP=prices[0];
        int maxP=0;
        for(int i=1;i<prices.length;i++){
            int temp=prices[i]-minP;
            maxP=Math.max(temp,maxP);
            minP=Math.min(prices[i],minP);
        }
        return maxP;
    }
}
