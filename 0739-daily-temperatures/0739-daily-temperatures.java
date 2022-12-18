class Solution {
  public int[] dailyTemperatures(int[] temperatures) {
    int[] solution=new int[temperatures.length];
    Stack<Integer> stack=new Stack(); 

    for(int i=0;i<temperatures.length;i++){
        while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()] ){
                solution[stack.peek()]=i-stack.peek(); 
                stack.pop();
            }
            stack.push(i);
        }
    
    return solution;
}
}