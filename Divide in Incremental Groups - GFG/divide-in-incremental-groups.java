//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int N = Integer.parseInt(br.readLine().trim());
            int K = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            System.out.println(ob.countWaystoDivide(N, K));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    private int dp[][][];
    private int recursion(int sum_left,int count,int prev){
        if(count==0){
            if(sum_left==0){
                return 1;
            }
            return 0;
        }
        if(sum_left==0)
            return 0;
            
        if(dp[sum_left][prev][count]!=-1)return dp[sum_left][prev][count];
        
        int ways=0;
        for(int i=prev;i<=sum_left;i++){
            ways+=recursion(sum_left-i,count-1,i);
        }
        return dp[sum_left][prev][count]=ways;
    }
    public int countWaystoDivide(int N, int K) {
        // 3D DP bcoz N is changing,K is changing,prev is also changing in recursion function
        dp=new int[N+1][N+1][K+1];
        for(int i=0;i<=N;i++){
            for(int j=0;j<=N;j++){
                for(int k=0;k<=K;k++){
                    dp[i][j][k]=-1;
                    }
                }
            }
        
        return recursion(N,K,1);
    }
}