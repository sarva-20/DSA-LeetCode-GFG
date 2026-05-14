class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int[] small = nums1;
        int[] larger = nums2;
        List<Integer> result = new ArrayList<>();
        

        if(nums1.length>nums2.length){
            small=nums2;
            larger=nums1;
        }

        for(int num : small){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(int num : larger){
            if(map.containsKey(num) && map.get(num) > 0){
                result.add(num);
                map.put(num, map.get(num)-1);
            }
        }

        int[] display = new int[result.size()];
        for(int i=0;i<result.size();i++){
            display[i]=result.get(i);
        }
        return display;
    }
}