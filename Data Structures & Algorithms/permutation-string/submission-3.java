class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] c1=s1.toCharArray();
        Arrays.sort(c1);
        String sorteds1=new String(c1);
        for(int i=0;i<s2.length();i++)
        {
            for(int j=i;j<s2.length();j++)
            {
                char[] substrarray=s2.substring(i,j+1).toCharArray();
                Arrays.sort(substrarray);
                String sorteds2= new String(substrarray);
                if(sorteds2.equals(sorteds1))
                {
                    return true;
                }
            }
        }
        return false;
    }
}