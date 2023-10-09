class Solution {
  // memoization
  int t[][];
  public int solve(int i,int j,int []nums1,int []nums2){
    if(i==nums1.length || j==nums2.length)
        return (int)(-10000009);
      
    if(t[i][j]!=-10000009)return t[i][j];  
      int single_ele = nums1[i] * nums2[j];
      
      int takeij = solve(i+1,j+1,nums1,nums2) + single_ele;
      
      int takei = solve(i+1,j,nums1,nums2) ;
      
      int takej = solve(i,j+1,nums1,nums2) ;
      
      return t[i][j] = Math.max(single_ele,Math.max(takeij,Math.max(takei,takej)));
    
    
  }
  
  
  
  
  /*
  recursive approach
  
  
    public int solve(int i,int j,int []nums1,int []nums2){
      
      if(i==nums1.length || j==nums2.length)
        return (int)(-10000009);
      
      
      int single_ele = nums1[i] * nums2[j];
      
      int takeij = solve(i+1,j+1,nums1,nums2) + single_ele;
      
      int takei = solve(i+1,j,nums1,nums2) ;
      
      int takej = solve(i,j+1,nums1,nums2) ;
      
      return Math.max(single_ele,Math.max(takeij,Math.max(takei,takej)));
      
      
    }*/
  
  
    public int maxDotProduct(int[] nums1, int[] nums2) {
        // such case  that are
      //   --> i frm nums1 and j frm nums2 (single element)
      //  --> i+1 frm  nums1 and j+1 frm nums2(for rest other)
      // --> i+1 frm nums1 and j frm nums2
      // --> i frm nums1 and j+1 frm nums2
      // out of the se four conditions maximum of these will be our desire output
      t = new int[1001][1001];
      for(int i=0;i<1001;i++){
        Arrays.fill(t[i],(int)(-10000009));
      }
      return solve(0,0,nums1,nums2);
      
    }
}