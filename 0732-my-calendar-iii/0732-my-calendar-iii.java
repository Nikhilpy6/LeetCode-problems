class MyCalendarThree {
    private TreeMap<Integer,Integer> map;
  
    public MyCalendarThree() {
        map=new TreeMap<>();
    }
    
    public int book(int start, int end) {
        map.put(start,map.getOrDefault(start,0)+1);
        map.put(end,map.getOrDefault(end,0)-1);
       int a=0;
      int max=0;
      for(int val : map.values()){
        a+=val;
        max=Math.max(max,a);
         }
      return max;
      }
      
      
    
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */