class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        //  This is used to sort the 2D array on the basis of fist element or second  ............
        Arrays.sort(properties,(b,a)->a[0]==b[0] ? b[1]-a[1] : a[0]-b[0]);
      
      
        int max=Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<properties.length;i++){
        //  System.out.println(properties[i][1]+" ");
            if(properties[i][1]<max)
                c++;
            else
                max=Math.max(max,properties[i][1]);
        }
        return c;
    }
}