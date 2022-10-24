class Solution {
    private boolean check(String s){
      Set<Character> se = new HashSet<>();
      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(se.contains(c)){
          return false;
        }
        se.add(c);
      }
      return true;
    }
    
    public int maxLength(List<String> arr) {
        List<String> slist= new ArrayList<>();
       int ans=0;
      slist.add("");
      for(String str : arr){
        if(!check(str))continue;
        List<String> nlist=new ArrayList<>();
        for(String can : slist){
            String temp=can+str;
          if(check(temp)){
            nlist.add(temp);
            ans=Math.max(ans,temp.length());
          }
        }
        slist.addAll(nlist);
      }
      return ans;
    }
}