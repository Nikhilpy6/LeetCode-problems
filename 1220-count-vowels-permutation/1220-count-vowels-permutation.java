class Solution {
    int a=0,e=1,i=2,o=3,u=4;
    long t[][];
    int m=(int)(1e9+7);
//     int solve1(char c,int n){
//       if(n==0)return 1;
      
//       if(c=='a'){
//         return solve('e',n-1);
//       }else if(c=='e'){
//         return solve('a',n-1)+solve('i',n-1);
//       }else if(c=='i'){
//         return solve('a',n-1)+solve('e',n-1)+solve('o',n-1)+solve('u',n-1);
//       }else if(c=='o'){
//         return solve('u',n-1)+solve('i',n-1);
//       }else{
//         return solve('a',n-1);
//       }
      
//       //return 0;
      
//     }
  
    long solve(int c,int n){
      if(n==0)
        return 1;
      
      if(t[c][n]!=-1)
        return t[c][n];
    
      if(c==a){
        t[c][n] =(solve(e,n-1))%m;
      }else if(c==e){
         t[c][n]=(solve(a,n-1)+solve(i,n-1))%m;
      }else if(c==i){
         t[c][n]=(solve(a,n-1)+solve(e,n-1)+solve(o,n-1)+solve(u,n-1))%m;
      }else if(c==o){
         t[c][n]=(solve(u,n-1)+solve(i,n-1))%m;
      }else{//'u'
         t[c][n]=(solve(a,n-1))%m;
      }
      
      return t[c][n];
      
    }
  
    public int countVowelPermutation(int n) {
        /*
        a-e
        e-a/i
        i-a/e/o/u
        o-i/u
        u-a
        
        */
      t = new long[5][n + 1];
        for (int i = 0; i < 5; i++) {
            Arrays.fill(t[i], -1);
        }
      long ans=0;  
      ans=(ans + solve(a,n-1))%m;
      ans=(ans + solve(e,n-1))%m;
      ans=(ans + solve(i,n-1))%m;
      ans=(ans + solve(o,n-1))%m;
      ans=(ans + solve(u,n-1))%m;
      
      return (int)ans;
    }
}