class Solution {
    public boolean isValid(String s) {
        Stack<Character>add=new Stack<>();
        HashMap<Character,Character>store=new HashMap<>();
        store.put(')','(');
         store.put('}','{');
          store.put(']','[');
          for(char c:s.toCharArray())
          {
            if(store.containsKey(c))
            {
                if(!add.isEmpty()&&add.peek()==store.get(c))
                {
                 add.pop();
                }
                else{
                    return false;
                }
            }
            else{
                add.push(c);
            }
          }
          return add.isEmpty();

        
    }
}
