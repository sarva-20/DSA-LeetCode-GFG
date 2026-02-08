class Solution {
    public int alternatingSum(int[] nums) {
        int totalsum=0;

        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                totalsum+=nums[i];
            }else{
                totalsum-=nums[i];
            }
        }
        return totalsum;
    }
}