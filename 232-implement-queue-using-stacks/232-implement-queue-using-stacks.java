class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int removed = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return removed;
    }
        
    
    
    public int peek() {
        while (!stack1.isEmpty()) {
      stack2.push(stack1.pop());
    }

    int peeked = stack2.peek();

    while (!stack2.isEmpty()) {
      stack1.push(stack2.pop());
    }
    return peeked;
    }
    public boolean empty() {
        return stack1.isEmpty();
    }
    
}