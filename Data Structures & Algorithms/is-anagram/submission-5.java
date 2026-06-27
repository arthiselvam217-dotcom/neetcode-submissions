class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        Map<Character,Integer>arthi=new HashMap<>();
        Map<Character,Integer>abi=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            arthi.put(s.charAt(i),arthi.getOrDefault(s.charAt(i),0)+1);
            abi.put(t.charAt(i),abi.getOrDefault(t.charAt(i),0)+1);
        }
        return arthi.equals(abi);

    }
}
