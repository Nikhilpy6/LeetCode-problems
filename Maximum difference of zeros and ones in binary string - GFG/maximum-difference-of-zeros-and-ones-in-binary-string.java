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
            System.out.println(ob.maxSubstring(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int maxSubstring(String S) {
        // code here
        //
        char ch[]=S.toCharArray();
        int zero=0;
        int one=0;
        int maxdiff=-1;
        int diff=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='0'){
                zero++;
            }
            else{
                one++;
            }
            diff=zero-one;
            if(diff>maxdiff){
                maxdiff=diff;
            }
            if(diff<0){
                diff=0;
                zero=0;
                one=0;
            }
        }
        return maxdiff;
    }
}