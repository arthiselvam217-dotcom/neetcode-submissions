class Solution {
    public int lengthOfLongestSubstring(String s) {
      int l=0;
      int r=0;
      int res=0;
       Set<Character>arthi=new HashSet<>();
     
      while(r<s.length())
      {
        
         if(arthi.contains(s.charAt(r)))
         {
          arthi.remove(s.charAt(l));
          l++;
         }
         else
         {
           arthi.add(s.charAt(r));
            r++;
            res=Math.max(res,arthi.size());
         }
         
         

      }
      return res;

        
    }
}
