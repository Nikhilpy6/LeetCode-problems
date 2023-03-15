class Solution {
    int dfs(int n,int r,int c,int ind,char arr[]){
      if(ind==arr.length)
        return 0;
      if(arr[ind]=='R' && c+1<n)
        return 1+dfs(n,r,c+1,ind+1,arr);
      else if(arr[ind]=='L' && c-1>=0)
        return 1+dfs(n,r,c-1,ind+1,arr);
      else if(arr[ind]=='U' && r-1>=0)
        return 1+dfs(n,r-1,c,ind+1,arr);
      else if(arr[ind]=='D' && r+1<n)
        return 1+dfs(n,r+1,c,ind+1,arr);
      else
        return 0;
        
    }
  
    public int[] executeInstructions(int n, int[] startPos, String s) {
      int size=s.length();
      int ans[]=new int[size];
      int r=startPos[0];
      int c=startPos[1];
      for(int i=0;i<size;i++){
        ans[i]= dfs(n,r,c,0,s.substring(i,size).toCharArray());
      }
      return ans;
    }
}

