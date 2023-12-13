//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int t[][];
    static boolean solve(int i,int arr[],int sum){
        if(i==arr.length){
            
            if(sum==0)
                return true;
                
            else
                return false;
        }
        
        if(sum==0)
            return true;
        
        if(t[i][sum]!=-1)
            return t[i][sum] ==0 ? false : true;
        
        
        
        boolean notake = solve(i+1,arr,sum);
        boolean take = false;
        if(sum>=arr[i]){
             take = solve(i+1,arr,sum-arr[i]);
        }
        
        t[i][sum] = take || notake ? 1 : 0;
        return notake || take;
    }


    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        t = new int[N+1][sum+1];
        for(int i=0;i<=N;i++){
            Arrays.fill(t[i],-1);
        }
        return solve(0,arr,sum);
    }
}