class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String ,Integer> hm =new HashMap<>();
      for(int i=0;i<list1.length;i++){
        hm.put(list1[i],i);
      }
      int min = Integer.MAX_VALUE;
      ArrayList<String> ans =new ArrayList<>();
      for(int i=0;i<list2.length;i++){
        if(hm.containsKey(list2[i])){
          int s = hm.get(list2[i])+i;
          if(min>s){
            min=s;
            ans.clear();
            ans.add(list2[i]);
            
          }
          else if(min==s){
            ans.add(list2[i]);
          }
        }
      }
      return ans.toArray(new String[0]);
    }
}