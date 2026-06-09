class Solution {
    public int maxArea(int[] height) {
        
        // Creating two-pointers 
        int left=0;
        int right = height.length-1;

        // Var to store max area

        int maxArea=0;

        // Iterate from left to right - middle

        while(left<right){
            int area = Math.min(height[left],height[right]) * (right-left);

            maxArea = Math.max(area,maxArea);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}