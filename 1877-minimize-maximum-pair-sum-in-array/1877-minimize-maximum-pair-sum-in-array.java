class Solution {
    public int minPairSum(int[] nums) {
        
        
        int maxVal = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxVal){
                maxVal = nums[i];  
            }
        }
        int[] count = new int[maxVal+1];

        for(int num : nums){
            count[num]++;
        }
        int start=0;
        int end = maxVal;

        int result=0;

        while(start<end){
            while(count[start]==0){
                start++;
            }
            while(count[end]==0){
                end--;
            }
            result = Math.max(result,start+end);
            if(count[start]>count[end]){
                count[start]-=count[end--];
            }else if(count[start]<count[end]){
                count[end]-=count[start++];
            }else{
                start++;
                end--;
            }
        }
        return result;


    }
}