class Solution {
    public int bestClosingTime(String c) {
     int n=c.length();
      int pen= 0;
      for(int i=1;i<n;i++){
          if(c.charAt(i)=='Y')pen++;
                  
        }
    int min=pen;
      int mini=0;
      for(int i=0;i<n;i++){
        
        char ch=c.charAt(i);
        if(ch=='Y')pen--;
        else
          pen++;
        
        if(pen<min){
          min=pen;
          mini=i+1;
        }
      }
      
      return mini;
    }
}