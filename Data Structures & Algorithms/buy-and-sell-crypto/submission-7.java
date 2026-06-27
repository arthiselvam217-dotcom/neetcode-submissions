class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int r=l+1;
        int maxp=0;
        while(r<prices.length)
        {
            if(prices[l]<prices[r])
            {
                int profit=prices[r]-prices[l];
                maxp=Math.max(maxp,profit);
                r++;
               
            }
           
            else{
                l=r;
                r++;
                
               
            }
           
            
            
            
        }
        return maxp;
    }
}
