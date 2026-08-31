class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        // Assign two pointers, similar to binary search with low and high points
        int minSpeed = 1;
        int maxSpeed = 0;

        // Loop to find the max size in "piles" e.g. [3,6,7,11] -> min is default 1 max is 11
        for(int pile : piles){
            maxSpeed = Math.max(maxSpeed, pile);
        }

        // Run binary search with operations
        while(minSpeed<maxSpeed){
            int mid = minSpeed + (maxSpeed-minSpeed)/2;

            // To calculate hours at current speed
            int hours=0;
            for(int pile : piles){
                hours+=(int) Math.ceil((double) pile/mid);
            }
            // If the hours got is less than the hours available, then
            if(hours<=h){
                maxSpeed=mid;
            }else{
                minSpeed = mid+1;
            }
        }
        return minSpeed;
    }
}