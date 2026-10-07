class Solution {
    public boolean isPalindrome(String s) {
        String arthi="";
        for(char c:s.toCharArray())
        {
            if(Character.isLetterOrDigit(c))
            {
                arthi+=Character.toLowerCase(c);
            }
        }
        String rev="";
        for(int i=arthi.length()-1;i>=0;i--)
        {
         rev+=arthi.charAt(i);
        }
        return arthi.equals(rev);
         
        
    }
}
