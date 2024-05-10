class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
//         PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> arr[b[0]]/arr[b[1]] - arr[a[0]]/arr[a[1]]);
      
//       for(int i=0;i<arr.length;i++){
//         for(int j=i+1;j<arr.length;j++){
//           pq.add(new int[]{i,j});
//         }
//       }
//       int n=arr.length;
//       while(n-k >0){
//         pq.poll();
//         n--;
//       }
//       int ans[] = pq.poll();
//       return ans; 
      
       int n = arr.length;
        PriorityQueue<int[]> minHeap = new PriorityQueue<int[]>((a,b)->(arr[a[0]]*arr[b[1]]-arr[b[0]]*arr[a[1]]));
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                minHeap.add(new int[]{i,j});
            }
        }
               
        int ar[]=new int[2];
        while(k!=0){
            ar= minHeap.poll();
            k--;
        }
        return new int[]{arr[ar[0]],arr[ar[1]]};
    }
}