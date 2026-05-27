class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length==0){
            return 0;
        }

        int num=1; // minimum number of elements in array
        for(int i=1;i<nums.length;i++){ // run till last of array
            if(nums[i]!=nums[i-1]){ // since array is sorted, prev and curr will be equal if duplicated
                nums[num]=nums[i];  
                num++;
            }
        }
        return num;
    }
}