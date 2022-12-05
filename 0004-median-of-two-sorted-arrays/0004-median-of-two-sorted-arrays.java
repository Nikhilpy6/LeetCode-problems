class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        //float median;
      int ans=0;
      double val=0;
        int []num=new int[m+n];
        for(int i=0;i<m;i++){
            num[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            num[m+i]=nums2[i];
        }
        Arrays.sort(num);
         for (int i=0 ; i<(m+n) ; i++){
        // even 
        if ((n+m)%2 ==0){
            ans = (n+m)/2;
            val = (long)(num[ans]+num[ans-1]);
			val = val/2;
            
        }
        else{
            // odd
            ans = (n+m)/2;
            val = num[ans];
        }
    }
    return val;
    }
        
}     
        
        
        
        
        
        
        
        
        
        
            
       
        