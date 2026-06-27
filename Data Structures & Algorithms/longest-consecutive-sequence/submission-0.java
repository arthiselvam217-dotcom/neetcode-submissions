class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=0;
        
        for(int i=0;i<nums.length;i++)
        {
            int current=nums[i];
            int count=1;
            boolean found =true;
            while(found)
            {
                found=false;
                for(int j=0;j<nums.length;j++)
                {
                    if(nums[j]==current+1)
                    {
                        current=nums[j];
                        count++;
                        found=true;
                        break;
                    }
                }
            }
            longest=Math.max(longest,count);

        }
        return longest;
        
    }
}
