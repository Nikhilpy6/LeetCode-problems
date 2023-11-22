class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
      List<Integer>  ans = new ArrayList<>();
      HashMap<Integer,List<Integer>>hm = new HashMap<>();
      
      for(int i=nums.size()-1;i>=0;i--){
        for(int j=0;j<nums.get(i).size();j++){
          // System.out.println(i+j+"$$");
          int val = i+j;
          if(!hm.containsKey(val)){
            hm.put(val,new ArrayList<>());
          }
          
          hm.get(val).add(nums.get(i).get(j));
        
          // System.out.println(hm.get(val)+"DICT");
        }
      }
      int dia=0;
      while(hm.containsKey(dia)){
        // System.out.println(hm.get(dia)+"**");
        for(int i:hm.get(dia)){
          ans.add(i);
        }
        dia++;
      }
      
      int res[] = new int[ans.size()];
      int j=0;
      for(int i:ans){
        res[j]=i;
        j++;
      }
      return res;
    }
}