class Solution {
    public String largestOddNumber(String num) {
        int end=-1;
        for(int i=0;i<num.length();i++){
          if((num.charAt(i)-'0')%2!=0){
            end = i;
          }
        }
      return end==-1 ? "" : num.substring(0,end+1);
    }
}