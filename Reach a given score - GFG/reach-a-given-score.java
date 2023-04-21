//{ Driver Code Starts
// Driver Code
import static java.lang.System.out;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int T = in.nextInt(); T-->0;) {
            int n = in.nextInt();
            
            Geeks obj = new Geeks();
            out.println(obj.count(n));
        }
    }
}
// } Driver Code Ends


// Complete this function!

class Geeks {
    public long count(int n) {
      int[] score = new int[]{3,5,10};
        
        long ways = hitTarget( n , score ,  score.length-1 );
        return ways;
        
    }
    
    
    public static long hitTarget( int target , int[] score , int currentIndex){
        
        
        if( target == 0 ){
            return 1;
        }
        
        if( currentIndex == 0 ){
            
            //Tricky Part
            if( target % score[0] == 0 ){
                return 1;
            }
            
            return 0;  
        }
        
        
        //2 options
        
        //take item. But Note ..We can take this item for multiple times , so we are not reducing the index
        long take=0;
        
        if( target>=score[ currentIndex ] ){
            take  = hitTarget( target-score[currentIndex] , score , currentIndex ); // here index is not reducing because we can use the item again
        }
        
        
        //not take
        long notTake = hitTarget( target , score , currentIndex-1 );
       
       
        long totalWays = take + notTake;

        return totalWays;
    }
}