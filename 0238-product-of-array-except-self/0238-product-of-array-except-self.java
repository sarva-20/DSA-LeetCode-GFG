class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        // Declaring arrays to pre-calculate left and right of i & answer
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] answer = new int[nums.length];

        left[0]=1; // By default, so that by multiplying to default number i.e. 0 is not done

        // Fill left array
        for(int i=1;i<nums.length;i++){
            left[i]=left[i-1]*nums[i-1];
        }

        right[nums.length-1]=1; // By default, last number doesn't have anything on right
        // Fill right array
        for(int i=nums.length-2;i>=0;i--){
            right[i]=right[i+1]*nums[i+1];
        }

        // Calculate answer
        for(int i=0;i<nums.length;i++){
            answer[i]=left[i] * right[i];
        }

        return answer;
    }
}