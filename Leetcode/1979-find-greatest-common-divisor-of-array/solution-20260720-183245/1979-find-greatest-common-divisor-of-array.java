class Solution {
    public int findGCD(int[] nums) {
        int smallest=Integer.MAX_VALUE;
        int greatest=Integer.MIN_VALUE;

        for(int num : nums){
            if(num>greatest){
                greatest=num;
            }if(num<smallest){
                smallest=num;
            }
        }
        // GCD
        while(smallest!=0){
            int temp = smallest;
            smallest=greatest%smallest;
            greatest=temp;
        }
        return greatest;


    }
}