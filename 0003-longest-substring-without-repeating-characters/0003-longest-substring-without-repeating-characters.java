class Solution {
    public int lengthOfLongestSubstring(String s) {
       /* HashSet<Character>set=new HashSet<>();
        int i=0;
        int j=0;
        int max=0;
       while(j<s.length()){
           if(!set.contains(s.charAt(j))){
               set.add(s.charAt(j));
               j++;
               max=Math.max(set.size(),max);
           }
           else{
               set.remove(s.charAt(i));
               i++;
           }
       }
        return max;
        
        
        HashMap<Character,Integer> map= new HashMap<>();
        int i=0;
        int j=0;
        int max= Integer.MIN_VALUE;
        while(j<s.length()){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),1)+1);
            if(map.size()== j-i+1){
                max=Math.max(max,j-i+1);
                j+=1;
            }
            else if(map.size()<j-i+1){
                while(map.size()<j-i+1){
                     map.put(s.charAt(i),map.get(s.charAt(i))-1);
                    if(map.get(s.charAt(i))==null)
                        map.remove(s.charAt(i));
                    }
                i+=1;
            }          
                   
            
        }
        return max;
        */
        
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0;
        int r=0;
        int len=0;
        while(r<s.length()){
            if(map.containsKey(s.charAt(r)))
                l=Math.max(map.get(s.charAt(r)) +1,l);
                
            
            map.put(s.charAt(r),r);    
            len=Math.max(len,r-l+1);
            r++;
            
        }
        return len;
     
    }
}