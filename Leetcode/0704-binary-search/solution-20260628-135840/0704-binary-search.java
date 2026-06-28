class Solution {
    public int search(int[] nums, int target) {
        
        // Set two pointers, one to the start and another to the end
        // e.g. nums = [2,2,5,7,99] target = 2
        // low pointer at 2 and high pointer at 99

        int low=0;
        int high=nums.length-1;

        // Run loop until low and high meet at the same point, when they meet, target is obtained

        while(low<=high){
            // Set mid 
            int mid=low+(high-low)/2;

            if(target==nums[mid]){
                return mid;
            }else if(target<nums[mid]){
                // Case where target element is smaller than mid
                high=mid-1;
            }else{
                // Case where target element is bigger than mid
                low=mid+1;
            }
        }
        // Return when not found
        return -1;
    }
}