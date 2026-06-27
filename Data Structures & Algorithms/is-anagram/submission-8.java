class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        Map<Character,Integer>abi=new HashMap<>();
         Map<Character,Integer>srini=new HashMap<>();
       
        for(int i=0;i<s.length();i++)
        {
            abi.put(s.charAt(i),abi.getOrDefault(s.charAt(i),0)+1);
            srini.put(t.charAt(i),srini.getOrDefault(t.charAt(i),0)+1);
        }
       return abi.equals(srini);
    }
}
