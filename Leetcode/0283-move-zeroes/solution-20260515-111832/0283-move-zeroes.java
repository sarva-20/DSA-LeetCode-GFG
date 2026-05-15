class Solution {
    public void moveZeroes(int[] nums) {
        
        int zerofinder = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[zerofinder]=nums[i];
                zerofinder++;
            }
        }
        while(zerofinder<nums.length){
            nums[zerofinder] = 0;
            zerofinder++;
        }
    }
}