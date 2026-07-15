class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer>arthi=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(arthi.contains(nums[i])){
                return true;
            }
            arthi.add(nums[i]);
        }
        return false;
        
    }
}