class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26)return false;
        int arr[]=new int[26];
        Arrays.fill(arr,1);
      Set<Character> set =new HashSet<>();
      for(int i=0;i<sentence.length();i++){
          set.add(sentence.charAt(i));
      }
      if(set.size()==26)
        return true;
      return false;
    }
}