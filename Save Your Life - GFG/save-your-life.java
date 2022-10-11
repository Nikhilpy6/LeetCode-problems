//{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends
class Solution{
    static String maxSum(String w,char x[],int b[], int n){
        int maxsum=0;
        int os=Integer.MIN_VALUE;
        int s=0;
        int st=0;
        int end=0;
        for(int i=0;i<w.length();i++){
            char ch=w.charAt(i);
            int ind=Index(x,ch);
            int val=ind==-1 ? (int)ch : b[ind];
            maxsum+=val;
            if(maxsum>os){
                os=maxsum;
                 st=s;
                end=i;
            }
            if(maxsum<0){
            maxsum=0;
            s=i+1;
            
         }    
            
        }
        return w.substring(st,end+1);
        
    }
    static int Index(char x[],char ch){
         for (int i = 0; i < x.length; i++) {
         if (ch == x[i]) 
            return i;
         }
       return -1;
    }
    
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String w = read.readLine();
            int n = Integer.parseInt(read.readLine());
            String TE[] = read.readLine().trim().split(" ");
            char x[] = new char[n];
            for(int i = 0;i<n;i++)
            {
                x[i] = TE[i].charAt(0);
            }
            
            String TR[] = read.readLine().trim().split(" ");
            int b[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                b[i] = Integer.parseInt(TR[i]);
            }
           
            Solution ob = new Solution();
            System.out.println(ob.maxSum(w,x,b,n));
        }
    }
}
// } Driver Code Ends