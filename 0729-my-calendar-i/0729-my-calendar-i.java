class MyCalendar {
//     List<int[]> calendar;

//     MyCalendar() {
//         calendar = new ArrayList();
//     }

//     public boolean book(int start, int end) {
//         for (int[] iv: calendar) {
//             if (iv[0] < end && start < iv[1]) return false;
//         }
//         calendar.add(new int[]{start, end});
//         return true;
//     }
// }
  
  
  
  
    TreeMap<Integer,Integer> tm;
    public MyCalendar() {
      tm = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        
//       if(tm.isEmpty()){
//         tm.put(start,end);
//         return true;
//       }
      
//       int lk=tm.lowKey(start)==null ? ;
//       int uk=tm.ceilingKey(end);
      
     
      int lk=tm.floorKey(start)==null ? -1 : tm.floorKey(start);
      int uk=tm.ceilingKey(start)==null ? -1 : tm.ceilingKey(start);
      
      if((lk==-1 || tm.get(lk)<=start)&& (uk==-1 || end<=uk)){
        tm.put(start,end);
        return true;
      }
      return false;
    }

}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */