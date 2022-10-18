class Solution {
    public String countAndSay(int n) {
      StringBuilder cur= new StringBuilder("1");
      //System.out.println(cur.length());
      for(int i=0;i<n-1;i++){
        StringBuilder sb= new StringBuilder();
        int c=1;
        for(int j=1;j<cur.length();j++){
          if (cur.charAt(j) == cur.charAt(j - 1)) c++;
          else{
                    sb.append(c).append(cur.charAt(j - 1));
                    c = 1;
                }
            
        }
        sb.append(c).append(cur.charAt(cur.length()-1));
        cur=sb;
        //System.out.println(sb);
      }
      return cur.toString();
    }
}

/*
   StringBuilder currStr = new StringBuilder("1");

        for (int k = 0; k < n - 1; k++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for (int i = 1; i < currStr.length(); i++) {
                if (currStr.charAt(i) == currStr.charAt(i - 1)) count++;
                else{
                    sb.append(count).append(currStr.charAt(i - 1));
                    count = 1;
                }
            }
            sb.append(count).append(currStr.charAt(currStr.length()-1));
            currStr = sb;
        }
        return currStr.toString();
        */