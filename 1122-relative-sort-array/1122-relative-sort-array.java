class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> counter = new HashMap<>();
        for(int num : arr1){
            counter.put(num, counter.getOrDefault(num,0)+1);
        }

        List<Integer> result = new ArrayList<>();

        for(int num : arr2){
            if(counter.containsKey(num)){
                for(int i=0;i<counter.get(num);i++){
                    result.add(num);
                }
                counter.remove(num);
            }
        }

        List<Integer> remaining = new ArrayList<>();

        for(int num : counter.keySet()){
            for(int i=0;i<counter.get(num);i++){
                remaining.add(num);
            }

        }

        Collections.sort(remaining);
        result.addAll(remaining);

        int[] resultarr = new int[result.size()];
        for(int i=0;i<result.size();i++){
            resultarr[i]=result.get(i);
        }
        return resultarr;
    }
}