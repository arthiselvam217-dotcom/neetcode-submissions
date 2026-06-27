class Solution {
    public int maxProfit(int[] prices) {
        int high=0;
       for(int i=0;i<prices.length-1;i++)
       {
        for(int j=i+1;j<prices.length;j++)
        {
            if(prices[i]<prices[j])
            {
                int abi=prices[j]-prices[i];
                high=Math.max(high,abi);
            }
        }

       }
       return high;

    }
        
    }

