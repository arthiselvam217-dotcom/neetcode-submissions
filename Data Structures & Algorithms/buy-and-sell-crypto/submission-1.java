class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int r=1;
        int high=0;
        while(r<prices.length)
        {
            
           if(prices[l]<prices[r])
           {
            int abi=prices[r]-prices[l];
             high=Math.max(high,abi);
            
           }

           else
           {
            l=r;
           }
           r++;
        
        }
    return high;
        
    }
}
