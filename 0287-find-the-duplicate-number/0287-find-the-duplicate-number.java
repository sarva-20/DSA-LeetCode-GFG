class Solution {
    public int findDuplicate(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int currentnum = nums[i];

            if(map.containsKey(currentnum)){
                int oldcount = map.get(currentnum);
                int newcount = oldcount+1;
                map.put(currentnum,newcount);
            }else{
                map.put(currentnum,1);
            }

            if(map.get(currentnum) > 1){
                return currentnum;
            }
        }
        return -1;

        
    }
}