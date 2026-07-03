class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minstack;

    public MinStack() {
        // Create a fresh new stack from the global stacks above
        stack = new Stack<>();
        minstack = new Stack<>();
    }
    
    public void push(int value) {
        stack.push(value);

        // If minstack if empty, add value to minstack also
        // If minstack has value, check if new value < existing value, then add
        if(minstack.isEmpty() || value<=minstack.peek()){
            minstack.push(value);
        }
    }
    
    public void pop() {
        int poppedval = stack.pop();

        // if popped val = top of minstack val, pop it from it from both
        if(poppedval==minstack.peek()){
            minstack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */