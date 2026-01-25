class Solution {
    public int minimumDifference(int[] nums, int k) {
        
        Arrays.sort(nums);
        
        int low = 0;
        int high = k-1;

        int mindiff = nums[high] - nums[low];

        while(high<nums.length){
            int diff = nums[high] - nums[low];
            mindiff = Math.min(mindiff, diff);

            low++;
            high++;
        }
        return mindiff;

    }
}