class Solution {
    int parent[];
    int comp;
  
  
    int find(int x){
     if(parent[x]==x)return x;
     return parent[x] = find(parent[x]);
    }
  
  
    boolean union(int p,int c){
      if(find(c)!=c)return  false;
      
      if(find(p)==c)return false;
      
      parent[c]=p;
      comp-=1;
      return true;
    }
  
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
      parent = new int[n];
      for(int i=0;i<n;i++)parent[i]=i;
      comp=n;
      for(int i=0;i<n;i++){
        int node = i;
        int lc = leftChild[i];
        int rc = rightChild[i];
        
        if(lc!=-1 && union(node,lc)==false)
            return false;
        if(rc!=-1 && union(node,rc)==false)
            return false;
        
        
        }
      
      return  comp==1;
        
    }
}