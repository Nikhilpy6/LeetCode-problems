class Solution {
    public int countSeniors(String[] details) {
        int sc =0 ;
      for(String s:details){
        int str = Integer.parseInt(s.substring(11,13));
        if(str >60)sc++;
      }
      return sc;
    }
}