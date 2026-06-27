class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "";
        StringBuilder sb=new StringBuilder();
        for(String s:strs)
        {
            sb.append(s.length()).append(",");
        }
        sb.append("#");
        for(String s:strs)
        {
            sb.append(s);
        }
        String str=new String(sb);
        return str;

    }

    public List<String> decode(String str) {
        if(str.length()==0)
        {
        return new ArrayList<>();
    }
        List<String>res=new ArrayList<>();
        List<Integer>sizes=new ArrayList<>();
        int i=0;
        while(str.charAt(i)!='#')
        {
            StringBuilder siz=new StringBuilder();
            while(str.charAt(i)!=',')
            {
              siz.append(str.charAt(i));
              i++;
            }
           
            sizes.add(Integer.parseInt(siz.toString()));
             i++;
        }
        i++;
       
        for(int sz:sizes)
        {
            res.add(str.substring(i,i+sz));
            i+=sz;
        }
       return res;
    }
}
