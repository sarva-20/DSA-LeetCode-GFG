class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];
        //ans[i] | (ans[i]+1) == nums[i]
        for(int i=0;i<nums.size();i++){
            int n1=0;
            ans[i]=-1;
            while(n1<nums.get(i)){
                int res = n1 | (n1+1);
                if(res == nums.get(i)){
                    ans[i] = n1;
                    break;
                }
                n1++;
            }
            
        }
        return ans;
    }
}