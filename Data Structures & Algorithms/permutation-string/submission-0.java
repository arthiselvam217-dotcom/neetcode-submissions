class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[]a=s1.toCharArray();
        Arrays.sort(a);
        String sorteds1=new String(a);
        for(int i=0;i<s2.length();i++)
        {
            for(int j=i;j<s2.length();j++)
            {
                char[]b=s2.substring(i,j+1).toCharArray();
                Arrays.sort(b);
                String sorteds2=new String(b);
                if(sorteds2.equals(sorteds1))
                {
                    return true;
                }


            }
        }
        return false;
        
    }
}
