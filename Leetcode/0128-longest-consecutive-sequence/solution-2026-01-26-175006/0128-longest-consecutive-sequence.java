
class Solution {
    public int longestConsecutive(int[] nums) {
        
        
        int longest =0;
        Map<Integer, Boolean> map = new HashMap<>();

        for(int num : nums){
            map.put(num, Boolean.FALSE);
        }

        for(int num : nums){
            int currentlen = 1;

            //Checking if the next element of target is in map
            int next = num+1;
            while(map.containsKey(next) && map.get(next) == false){
                currentlen++;
                map.put(next, Boolean.TRUE);
                next++;
            }
            
            //Checking if the prev element of the target is in the map
            int prevnum = num-1;
            while(map.containsKey(prevnum) && !map.get(prevnum)){
                currentlen++;
                map.put(prevnum, Boolean.TRUE);
                prevnum--;
            }

            longest = Math.max(longest, currentlen);
        }
        return longest;
        
    }
}
