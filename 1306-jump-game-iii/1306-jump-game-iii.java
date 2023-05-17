class Solution {
    public boolean canReach(int[] arr, int start) {
//         check whether u reach at any index whixh has value == 0
//       2 calls --> i+arr[i] and  i-arr[i] within range
//       start ind=start
      
      Queue<Integer> q = new LinkedList<>();
      q.offer(start);
      int vis[]=new int[arr.length];
      while(!q.isEmpty()){
        int s=q.size();
        
        int cu=q.poll();
        if(arr[cu]==0)return true;
        if(cu+arr[cu]>=0 && cu+arr[cu]<arr.length && vis[cu+arr[cu]]==0){
          vis[cu+arr[cu]]=1;
          q.add(cu+arr[cu]);
        }
        if(cu-arr[cu]>=0 && cu-arr[cu]<arr.length && vis[cu-arr[cu]]==0){
          vis[cu-arr[cu]]=1;
          q.add(cu-arr[cu]);
        }
        
      }
      return false;
    }
}