class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int max=0;
        while(l<r)
        {
               int min=Math.min(heights[l],heights[r]);
               int amount=min*(r-l);
                max=Math.max(max,amount);
              if(heights[l]<=heights[r])
              {
                 l++;
              }
              else{
                r--;
              }
        }
        return max;
            
        
    }
}
