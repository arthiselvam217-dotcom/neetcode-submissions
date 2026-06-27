class Solution {
    public int lengthOfLongestSubstring(String s) {
      int maxl=0;
      for(int i=0;i<s.length();i++)
      {
        Set<Character>arthi=new HashSet<>();
        for(int j=i;j<s.length();j++)
        {
          if(arthi.contains(s.charAt(j)))
          {
            break;
          }
          arthi.add(s.charAt(j));
          maxl=Math.max(maxl,arthi.size());

        }
      }
      return maxl;
        
    }
}
