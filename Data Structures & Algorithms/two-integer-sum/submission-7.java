class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>sum=new HashMap<>();
        for(int i=0;i<nums.length;i++)
       {
           int num=nums[i];
            int c=target-num;
            if(sum.containsKey(c))
            {
                return new int[]{sum.get(c),i};
            }
            sum.put(num,i);

        }
        return new int[]{};
        
    }
}
