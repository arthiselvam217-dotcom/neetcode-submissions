class Solution {
    public int characterReplacement(String s, int k) {
        
        Map<Character,Integer>arthi=new HashMap<>();
        
        int maxf=0;int res=0;
        int l=0;
        for(int r=0;r<s.length();r++)
        {
            arthi.put(s.charAt(r),arthi.getOrDefault(s.charAt(r),0)+1);
            maxf=Math.max(maxf,arthi.get(s.charAt(r)));
            while((r-l+1)-maxf>k)
            {
                arthi.put(s.charAt(l),arthi.get(s.charAt(l))-1);
                l++;
            }
            res=Math.max(res,r-l+1);
        } 
        
        return res;
        
        
        
    }
}
