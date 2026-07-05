class Solution {
    public int evalRPN(String[] tokens) {
        List<String>tokenlist=new ArrayList<>(Arrays.asList(tokens));
        while(tokenlist.size()>1)
        {
            for(int i=0;i<tokenlist.size();i++)
            {
                String token=tokenlist.get(i);
                if("+-*/".contains(token))
                {
                    int a=Integer.parseInt(tokenlist.get(i-2));
                     int b=Integer.parseInt(tokenlist.get(i-1));
                     int result=0;
                     if(token.equals("+"))
                     {
                        result=a+b;
                     }
                     else if(token.equals("-"))
                     {
                        result=a-b;
                     }
                     else if(token.equals("*"))
                     {
                        result=a*b;
                     }
                     else if(token.equals("/"))
                     {
                        result=a/b;
                     }
                     tokenlist.set(i-2,String.valueOf(result));
                     tokenlist.remove(i);
                     tokenlist.remove(i-1);
                     break;
                     
                     
                     
                     

                     
                }
            }


        }
        return Integer.parseInt(tokenlist.get(0));
        
    }
}
