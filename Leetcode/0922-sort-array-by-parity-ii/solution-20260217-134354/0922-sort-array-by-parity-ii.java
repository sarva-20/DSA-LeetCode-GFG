class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int  n = nums.length;
        int evenindx = 0;
        int oddindx = 1;

        while(evenindx < n && oddindx < n){
            if(nums[evenindx]%2==0 && nums[oddindx]%2!=0){
                evenindx+=2;
                oddindx+=2;
            }else if(nums[evenindx]%2==0){
                evenindx+=2;
            }else if(nums[oddindx]%2!=0){
                oddindx+=2;
            }else{
                int temp = nums[evenindx];
                nums[evenindx]=nums[oddindx];
                nums[oddindx] = temp;
            }
        }
        return nums;
    }
}