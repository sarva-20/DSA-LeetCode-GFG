class Solution {
    public int minimumCost(int[] nums) {
        int firstminimum =nums[0];
        int secondminimum=Integer.MAX_VALUE;
        int thirdminimum=Integer.MAX_VALUE;

        for(int i=1;i<nums.length;i++){
            if(nums[i]<secondminimum){
                thirdminimum=secondminimum;
                secondminimum=nums[i];
            } else if(nums[i]<thirdminimum){
                thirdminimum=nums[i];
            }
        }
        return firstminimum+secondminimum+thirdminimum;
    }
}