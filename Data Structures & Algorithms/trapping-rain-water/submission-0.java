class Solution {
    public int trap(int[] height) {
        int res=0;
        
        for(int i=1;i<=height.length-1;i++)
        {
            int lb=height[i];
            for(int j=0;j<i;j++)
            {
               lb=Math.max(lb,height[j]);
            }
            int rb=height[i];
            for(int j=i+1;j<height.length;j++)
            {
                rb=Math.max(rb,height[j]);
            }
            int level =Math.min(lb,rb);
            int tw=level-height[i];
            res=res+tw;
         }
        
        return res;

        
        
    }
}
