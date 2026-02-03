class Solution {
    public int thirdMax(int[] nums) {
        Long firstmax=null;
        Long secondmax=null;
        Long thirdmax=null;


        for(int num : nums){
            if((firstmax!=null && num==firstmax ) || (secondmax!=null && num==secondmax) || (thirdmax!=null &&num==thirdmax)){
                continue;
            }

            if(firstmax==null || num>firstmax){
                thirdmax = secondmax;
                secondmax=firstmax;
                firstmax=(long)num;
            }else if(secondmax==null || num>secondmax){
                thirdmax=secondmax;
                secondmax = (long)num;
            }else if(thirdmax==null || num>thirdmax){
                thirdmax=(long)num;
            }
        }
        
        return (thirdmax==null) ? firstmax.intValue() : thirdmax.intValue();

    }
}