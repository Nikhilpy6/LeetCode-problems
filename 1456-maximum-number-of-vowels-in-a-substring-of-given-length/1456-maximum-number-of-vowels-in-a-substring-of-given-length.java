class Solution {
    public int maxVowels(String s, int k) {
        
        
      int count=0;
      for(int i=0;i<k;i++){
        char c= s.charAt(i);
        if(c=='a' || c=='e' || c=='i'|| c=='o' || c=='u')
          count++;
        
      }
      int max=count;
      
      for(int i=k;i<s.length();i++){
        char c = s.charAt(i-k);
        char c2=s.charAt(i);
        if(c=='a' || c=='e' || c=='i'|| c=='o' || c=='u')
           count--;
        
        if(c2=='a' || c2=='e' || c2=='i'|| c2=='o' || c2=='u')
          count++;
        if(count==k)return k; 
        max=Math.max(count,max);
      }
      return max;
    }
}