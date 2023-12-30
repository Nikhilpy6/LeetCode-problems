class Solution {
    public boolean makeEqual(String[] words) {
        int arr[] = new int[26];
      
        for(String s : words){
          for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
          }
          
        }
      for(int i=0;i<26;i++){
        if(arr[i]%words.length !=0)
          return false;
      }
      return true;
    }
}