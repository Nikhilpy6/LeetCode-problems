//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntMatrix {
    public static int[][] input(BufferedReader br, int n, int m) throws IOException {
        int[][] mat = new int[n][];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().trim().split(" ");
            mat[i] = new int[s.length];
            for (int j = 0; j < s.length; j++)
                mat[i][j] = Integer.parseInt(s[j]);
        }

        return mat;
    }

    public static void print(int[][] m) {
        for (var a : m) {
            for (int e : a) System.out.print(e + " ");
            System.out.println();
        }
    }

    public static void print(ArrayList<ArrayList<Integer>> m) {
        for (var a : m) {
            for (int e : a) System.out.print(e + " ");
            System.out.println();
        }
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            int[][] intervals = IntMatrix.input(br, n, 3);

            Solution obj = new Solution();
            int res = obj.maximum_profit(n, intervals);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int maximum_profit(int n, int[][] intervals) {
        //lambda anonymous function
        Arrays.sort(intervals,(a,b)-> {
            if(a[0]!=b[0])return a[0]-b[0];
            return a[1]-b[1];
        });
        int dp[]=new int[n];
        return recursion(0,intervals,n,dp);
    }
    public static int recursion(int ind,int[][] ar,int n,int []dp){
        if(ind>=n)return 0;
        if(dp[ind]!=0)return dp[ind];
        int ns=recursion(ind+1,ar,n,dp);
        int newind= Index(ind+1,ar[ind][1],ar,n);
        int s=ar[ind][2]+recursion(newind , ar,n,dp);
        return dp[ind]=Math.max(s,ns);
    }
    static int Index(int i,int prevI,int[][]ar,int n){
        while(i<n){
            if(ar[i][0]>=prevI)
                break;
            else
                i++;
        }
        return i;
    }
}
