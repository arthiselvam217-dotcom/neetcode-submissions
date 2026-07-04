class MinStack {
    private Stack<Integer>stack;

    public MinStack() {
        stack=new Stack<>();
        
    }
    
    public void push(int val) {
        stack.push(val);
        
    }
    
    public void pop() {
        stack.pop();
        
    }
    
    public int top() {
       return stack.peek();
        
    }
    
    public int getMin() {
        Stack<Integer>minstack=new Stack<>();
        int mini=stack.peek();
        while(!stack.isEmpty())
        {
            mini=Math.min(mini,stack.peek());
            minstack.push(stack.pop());
        }
        while(!minstack.isEmpty())
        {
            stack.push(minstack.pop());
        }
        return mini;
        
    }
}
