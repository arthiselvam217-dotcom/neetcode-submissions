class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int res=0;
        Set<Character> arthi=new HashSet<>();
        for(int r=0;r<s.length();r++)
        {
          while(arthi.contains(s.charAt(r)))
          {
            arthi.remove(s.charAt(l));
            l++;
          }
          arthi.add(s.charAt(r));
          res=Math.max(res,r-l+1);
        }

        return res;
    }
}
