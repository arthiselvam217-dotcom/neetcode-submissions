class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
           map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        int need=map.size();
       
        for(int i=0;i<s2.length();i++)
         {
             int cur=0;
             HashMap<Character,Integer>mapp=new HashMap<>();
             for(int j=i;j<s2.length();j++)
             {
                     
                mapp.put(s2.charAt(j),mapp.getOrDefault(s2.charAt(j),0)+1);
                if(map.getOrDefault(s2.charAt(j),0)<mapp.get(s2.charAt(j)))
                {
                    break;
                }
                 if(map.getOrDefault(s2.charAt(j),0)==mapp.get(s2.charAt(j)))
                {
                   cur++;
                }
                 if(cur==need)
                {
                 return true;
                }
                
             }
            
        }
        return false;
        

        
    }
}
