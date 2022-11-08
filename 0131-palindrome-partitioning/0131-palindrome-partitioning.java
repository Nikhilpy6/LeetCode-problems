class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>ans = new ArrayList<>();
        recursion(ans,s,0,new ArrayList<>());
        return ans;
    }
    
   public void recursion(List<List<String>>ans,String s,int index,List<String>path){
     if(index==s.length()){
       ans.add(new ArrayList<>(path)); 
       return;
       }
       
       for(int i=index;i<s.length();i++){
         if(isPalindrome(index,i,s)){
           path.add(s.substring(index,i+1));
           recursion(ans,s,i+1,path);
           path.remove(path.size()-1);
           
         }
       }
     }
  boolean isPalindrome(int st,int end,String s){
    while(st<=end){
      if(s.charAt(st)!=s.charAt(end))
        return false;
      st+=1;
      end-=1;
    }
    return true;
  }
   
}