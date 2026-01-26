
class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        
        // Step 1: Put all numbers into HashSet
        for (int num : nums) {
            set.add(num);
        }
        
        int longest = 0;
        
        // Step 2: Try to start sequences
        for (int num : set) {
            
            // Only start if num is the beginning of a sequence
            if (!set.contains(num - 1)) {
                
                int currentNum = num;
                int currentStreak = 1;
                
                // Step 3: Grow the sequence forward
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                
                // Step 4: Update answer
                longest = Math.max(longest, currentStreak);
            }
        }
        
        return longest;
    }
}
