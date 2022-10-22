class Solution {
    public String minWindow(String s, String t) {
        String ans="";
        HashMap<Character,Integer> mp2=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            mp2.put(ch,mp2.getOrDefault(ch,0)+1);
            
        }
        int mct=0;
        int dmct=t.length();
        int i=-1;
        int j=-1;
        HashMap<Character,Integer> mp1= new HashMap<>();
        while(true){
            boolean f1=false;
            boolean f2=false;
            
            //acquire
            
            while(j<s.length()-1 && mct<dmct){
                f1=true;
                j++;
                char ch=s.charAt(j);
                mp1.put(ch,mp1.getOrDefault(ch,0)+1);
                if(mp1.getOrDefault(ch,0)<=mp2.getOrDefault(ch,0))
                    mct++;
                
                
            }
            while(i<j && mct==dmct){
            String pans=s.substring(i+1,j+1); 
                if(pans.length()<ans.length() || ans.length()==0)
                    ans=pans;
                i++;
                char ch=s.charAt(i);
                if(mp1.get(ch)==1)
                    mp1.remove(ch);
                else
                    mp1.put(ch,mp1.get(ch)-1);
                   
                if(mp1.getOrDefault(ch,0)<mp2.getOrDefault(ch,0))
                    mct--;
               f2=true; 
            }
            if(f1==false && f2==false)
                break;
            
        }
        return ans;
    }
}