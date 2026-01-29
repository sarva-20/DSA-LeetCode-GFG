class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] result = new int[nums.size()];

        for(int i=0;i<nums.size();i++){
            int target = nums.get(i);

            int answer = -1; // default 
            int bits = 1; //used to identify least significant bits

            while((target & bits)!=0){
                answer = target-bits;
                bits <<= 1; //leftshift bit
            }
            result[i]=answer;
        }
        return result;
    }
}