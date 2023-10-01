//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.distinctSubsequences(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int distinctSubsequences(String s) {
        // code here
        int mod =(int)(1e9+7);
        HashMap<Character,Integer> hm =new HashMap<>();
        int dp[] = new int[s.length()+1];
        dp[0]=1;
        
        for(int i=1;i<dp.length;i++){
            dp[i] = (2 * dp[i-1]) % mod;
            char ch = s.charAt(i-1);
            
            if(hm.containsKey(ch)){
                int j= hm.get(ch);
                dp[i] = (dp[i] - dp[j-1])%mod;
                
            }
            hm.put(ch,i);
            
            
        }
        if(dp[s.length()]<0) dp[s.length()]+=mod;
        return dp[s.length()];
    }
}