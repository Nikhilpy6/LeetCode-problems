class Solution {
    public List<String> letterCasePermutation(String s) {
       List<String> ans = new ArrayList<>();
        backtrack(ans, 0, s.toCharArray());
        return ans;
    }
    public void backtrack(List<String> ans, int i, char[] S){
        if(i==S.length){
            ans.add(new String(S));
            return;
        }
        else{
            if(Character.isLetter(S[i])){ //If it's letter
                S[i] = Character.toUpperCase(S[i]);
                backtrack(ans, i+1, S); //Upper case branch
                S[i] = Character.toLowerCase(S[i]);
                backtrack(ans, i+1, S); //Lower case branch
            }
            else
                backtrack(ans, i+1, S); 
        }  
    }
}