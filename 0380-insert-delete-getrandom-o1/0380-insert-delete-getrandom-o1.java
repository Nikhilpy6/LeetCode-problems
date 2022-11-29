class RandomizedSet {
    private HashMap<Integer,Integer> hm ;
    private List<Integer> list;
    public RandomizedSet() {
        hm=new HashMap<>();
        list=new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(!hm.containsKey(val)){
          list.add(val);
          hm.put(val,list.size()-1);
          return true;
        }
      return false;
    }
    
    public boolean remove(int val) {
        if(hm.containsKey(val)){
          int pos=hm.get(val);
          list.set(pos,list.get(list.size()-1));
          hm.put(list.get(pos),pos);
          list.remove(list.size()-1);
          hm.remove(val);
          return true;
        }
      return false;
    }
    
    public int getRandom() {
       return list.get((int)(Math.random() * list.size()));
      
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */