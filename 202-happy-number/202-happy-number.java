class Solution {
   /* private static int isSqrt(int temp){
        int sum=0;
        while(temp!=0){
            int d=temp%10;
            sum+=d*d;
            temp/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {//brute force approach
        int temp=n;
        while(temp!=1){
            temp= isSqrt(temp);
        }
        if(temp==1)
            return true;
        return false;
    }*/
    public boolean isHappy(int n){
        HashSet<Integer> set=new HashSet<>();
        while(true){
            int sum=0;
            while(n!=0){
                sum+=Math.pow(n%10,2.0);
                n/=10;  
            }
            if(sum==1)return true;
            n=sum;
            if(set.contains(n))return false;
            set.add(n);
        }
    }
}