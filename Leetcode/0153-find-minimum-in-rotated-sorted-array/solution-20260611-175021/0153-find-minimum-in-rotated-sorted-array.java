class Solution {
    public int findMin(int[] nums) {
        int minval=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<minval){
                minval=nums[i];
            }
        }
        return minval;
    }
}