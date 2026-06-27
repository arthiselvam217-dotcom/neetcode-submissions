class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String ,List<String>> arthi=new HashMap<>();
        for(String abi:strs)
        {
           char[] sri=abi.toCharArray();
           Arrays.sort(sri);
           String amma=new String(sri);
           arthi.putIfAbsent(amma,new ArrayList<>());
           arthi.get(amma).add(abi);

        }
        return new ArrayList<>(arthi.values());
        
    }
}
