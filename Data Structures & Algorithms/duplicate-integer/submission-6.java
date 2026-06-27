class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer>arthi=new HashSet<>();
        for( int num:nums)
        {
            if(arthi.contains(num))
            {
              return true;
            }
            arthi.add(num);
        }
        return false;
    }
}