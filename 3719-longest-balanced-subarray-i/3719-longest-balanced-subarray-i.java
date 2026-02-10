class Solution {
    public int longestBalanced(int[] nums) {
        int maxlen=0;

        for(int i=0;i<nums.length;i++){
            Set<Integer> oddSet = new HashSet<>();
            Set<Integer> evenSet = new HashSet<>();

            for(int j=i;j<nums.length;j++){
                int currentnum = nums[j];

                if(currentnum%2==0){
                    evenSet.add(currentnum);
                }else{
                    oddSet.add(currentnum);
                }

                if(evenSet.size()==oddSet.size()){
                    int currentlength = j-i+1;
                    maxlen = Math.max(maxlen, currentlength);
                }
            }
        }
        return maxlen;
    }
}