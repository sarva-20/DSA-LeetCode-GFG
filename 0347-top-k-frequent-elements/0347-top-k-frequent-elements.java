class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        List<Integer>[] bucket = new List[nums.length +1];
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        for(int key : map.keySet()){
            int frequency = map.get(key);
            if(bucket[frequency]==null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        int[] result = new int[k];

        int counter=0;

        for(int position = bucket.length-1; position >=0 && counter < k; position--){
            if(bucket[position] != null){
                for(Integer integer : bucket[position]){
                    result[counter++] = integer;
                }
            }
        }
        return result;

        

    }
}