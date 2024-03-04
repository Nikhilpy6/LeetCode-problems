class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
      int st = 0;
      int end= tokens.length-1;
      int score=0,max = 0;
      while(st<=end){
        if(tokens[st]<=power)// atleast tokens[i] for face-up
        {
          score+=1;
          power-=tokens[st];
          max = Math.max(max,score);
          st++;
        }
        else if(score>0) // face-down reducing score
        {
          power+=tokens[end];
          score-=1;
          end--;
        }
        else
          break;
      }
      return max;
    }
}