class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hash_set = new HashSet<Integer>();
        int currentStreak, maxStreak=0, currentNumber;
        
        // Inserting all the elements of the array into the HashSet O(1) time. Overall O(n). 
        for(int i: nums)
            hash_set.add(i);
        
        // Looping through the Hashset.
        for(int i: hash_set){
            
            //Check for consecutive series only current number is the first number in the series.
            // That is when the number just smaller than the current Number isn't in the set.
            if(  !(hash_set.contains(i -1))  ){
                currentNumber = i;
                currentStreak = 1;
                
                // Continue counting the consecutive streak 
                // until consecutive numbers greater than current number are found in the set.
                while(hash_set.contains(currentNumber + 1)){
                    currentStreak++;
                    currentNumber += 1;
                }
                
                maxStreak = Math.max(currentStreak, maxStreak);

            }
        }
        
        
        return maxStreak;
        
    }
}