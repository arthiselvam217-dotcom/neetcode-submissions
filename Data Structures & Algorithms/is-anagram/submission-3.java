class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        char[] schar=s.toCharArray();
        char[] tchar=t.toCharArray();
        Arrays.sort(schar);
        Arrays.sort(tchar);
       String arthi=new String(schar);
       String abi=new String(tchar);
       
    return arthi.equals(abi);
      

    }
}
