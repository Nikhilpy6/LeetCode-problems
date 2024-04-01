class Solution {
    public int lengthOfLastWord(String s) {
        String str[]=s.split(" ");
        int length=str.length;
       return str[length-1].length();
    // return ans.length();
    }
}