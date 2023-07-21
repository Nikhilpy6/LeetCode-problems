class FrontMiddleBackQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public FrontMiddleBackQueue() {
        stack1=new Stack<>();
        stack2=new Stack<>();  
      
    }
    
    public void pushFront(int val) {
       while(!stack1.isEmpty()){
         int c=stack1.pop();
         stack2.add(c);
       }
      stack1.add(val);
      while(!stack2.isEmpty()){
         int c=stack2.pop();
         stack1.add(c);
       }
      
    }
    
    public void pushMiddle(int val) {
       int s=stack1.size();
     
      int mid=s/2;
      
      while(stack1.size()>mid){
        int v= stack1.pop();
        stack2.add(v);
       }
      
      stack1.add(val);
      while(!stack2.isEmpty()){
         int c=stack2.pop();
         stack1.add(c);
       }
    }
    
    public void pushBack(int val) {
      stack1.add(val);
    }
    
    public int popFront() {
        while(!stack1.isEmpty()){
         int c=stack1.pop();
         stack2.add(c);
       }
       int ans= stack2.isEmpty() ? -1: stack2.pop();;
        
      while(!stack2.isEmpty()){
         int c=stack2.pop();
         stack1.add(c);
       }
      return ans;
    }
    
    public int popMiddle() {
       int size=stack1.size();
      int ans=0;
       int mid=size/2;
      while(mid<stack1.size()){
        int t=stack1.pop();
        stack2.add(t);
      }
      if((size&1)==1)
        ans=stack2.isEmpty() ? -1: stack2.pop();
      else
         ans=stack1.isEmpty() ? -1: stack1.pop();
      
      while(!stack2.isEmpty()){
         int c=stack2.pop();
         stack1.add(c);
       }
      
      return ans;
    }
    
    public int popBack() {
      int ans=stack1.isEmpty() ? -1: stack1.pop();
      return ans;
         
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */