class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set  = new HashSet<>();

        int sum=0;
        int uniquesum=0;
        for(int num : nums){
            sum+=num;
            
            if(set.add(num)){
                uniquesum+=num;
            }
        }
        return 2*uniquesum-sum;
    }
}