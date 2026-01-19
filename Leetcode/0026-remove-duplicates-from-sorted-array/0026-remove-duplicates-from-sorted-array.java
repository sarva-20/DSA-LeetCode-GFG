class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length==0){
            return 0;
        }

        int num=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[num]=nums[i];
                num++;
            }
        }
        return num;
    }
}