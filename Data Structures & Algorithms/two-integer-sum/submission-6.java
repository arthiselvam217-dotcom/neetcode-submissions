class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer>arthi=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int com=target-nums[i];
            if(arthi.containsKey(com))
            {
                return new int[]{arthi.get(com), i};
            }
            arthi.put(nums[i], i);
        }
        return new int[]{};
    }
}
