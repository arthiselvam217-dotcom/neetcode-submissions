class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int maxa=0;
        for(int i=0;i<n;i++)
        {
            int height=heights[i];
            int rm=i+1;
            while(rm<n && heights[rm]>=height)
            {
                rm++;
            }
            int lm=i;
            while(lm>=0 && heights[lm]>=height)
            {
                lm--;
            }
            rm--;
            lm++;
            maxa=Math.max(maxa,height*(rm-lm+1));

        }
        return maxa;
        
    }
}
