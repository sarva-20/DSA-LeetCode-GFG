class Solution {
    public int minPairSum(int[] nums) {
        
        Arrays.sort(nums);

        int start =0;
        int end = nums.length-1;

        int max =0;

        for(int i=0;i<nums.length-1;i++){
            int pairSum = nums[start] + nums[end];
            if(pairSum > max){
                max = pairSum;
            }
            start++;
            end--;
        }
        return max;

    }
}