class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();
        for(String s:strs)
        {
            int[]count=new int[26];
            for(char c:s.toCharArray())
            {
                count[c-'a']++;

            }
            String arthi=Arrays.toString(count);
            map.putIfAbsent(arthi,new ArrayList<>());
            map.get(arthi).add(s);
        }
        return new ArrayList<>(map.values());
        
    }
}
