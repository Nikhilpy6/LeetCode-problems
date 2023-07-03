class Solution {
   boolean checkfreq(String s){
     int freq[]=new int[26];
      for(int i=0;i<s.length();i++){
        freq[s.charAt(i)-'a']++;
        
        if(freq[s.charAt(i)-'a']>1)return true;
      }   
     return false;
   }
  
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length())return false;
      char sarr[]=s.toCharArray();
      char garr[]=goal.toCharArray();
      if(s.equals(goal)){
        return checkfreq(s);
      }
      
      List<Integer> idx =new ArrayList<>();
      for(int i=0;i<s.length();i++){
        if(sarr[i]!=garr[i]){
          idx.add(i);
        }
      }
      
      if(idx.size()!=2)return false;
      int f=idx.get(0);
      int l=idx.get(1);
      
      char a=sarr[f];
      sarr[f]=sarr[l];
      sarr[l]=a;
      
      String st=new String(sarr);
      String gt=new String(garr);
      return st.equals(gt);
      
      
    }
}