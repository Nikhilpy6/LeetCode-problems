class MyQueue {
   Stack<Integer> in;
   Stack<Integer>op;
    public MyQueue() {
        in=new Stack<>();
        op=new Stack<>();
      
    }
    
    public void push(int x) {
       in.push(x);
    }
    
    public int pop() {
       if(op.isEmpty()){
         conversion();
       }
      return op.pop();
    }
    
    public int peek() {
         if(op.isEmpty()){
         conversion();
       }
      return op.peek();
    }
    
    public boolean empty() {
        return in.isEmpty() && op.isEmpty();
    }
  public void conversion(){
    int size=in.size();
    for(int i=0;i<size;i++){
      int top=in.pop();
      op.push(top);
    }
  }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */