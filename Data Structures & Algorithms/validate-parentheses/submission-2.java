class Solution {
    public boolean isValid(String s) {
        Stack<Character>store=new Stack<>();
        Map<Character,Character>add=new HashMap<>();
        add.put(')','(');
          add.put(']','[');
            add.put('}','{');

        for( char c:s.toCharArray())
        
        {

           if(add.containsKey(c))
           {
            if(!store.isEmpty()&&store.peek()==add.get(c))
            {
                store.pop();
            }
            else{
                return false;
            }
           }
            else{
            store.push(c);
           }
           
           
        }
        return store.isEmpty();
        
    }
}
