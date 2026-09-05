class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>>arthi=new HashMap<>();
       for(String s:strs)
       {
        char[] sc=s.toCharArray();
        Arrays.sort(sc);
        String scc=new String(sc);
        arthi.putIfAbsent(scc,new ArrayList<>());
        arthi.get(scc).add(s);

       }
       return new ArrayList<>(arthi.values());


        
    }
}
