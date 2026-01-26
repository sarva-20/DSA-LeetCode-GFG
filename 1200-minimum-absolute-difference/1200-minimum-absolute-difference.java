class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        Arrays.sort(arr);

        int mindiff = Integer.MAX_VALUE;

        for(int i=0;i<arr.length-1;i++){
            int diff = arr[i+1] - arr[i];
            if(diff < mindiff){
                mindiff = diff;
            }
        }

        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1] - arr[i] == mindiff){
                result.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }
        return result;


    }
}