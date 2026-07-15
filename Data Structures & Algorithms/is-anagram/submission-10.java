class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Integer>arthi=new HashMap<>();
        HashMap<Character,Integer>abi=new HashMap<>();
        for(char st:s.toCharArray())
        {
            arthi.put(st,arthi.getOrDefault(st,0)+1);
        }
        for(char ts:t.toCharArray())
        {
            abi.put(ts,abi.getOrDefault(ts,0)+1);
        }
        return arthi.equals(abi);



    }
}
