class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        // Create array to store output days
        int n = temperatures.length;
        int[] result = new int[n];

        // Loop from last to find greater element that previous (one such method)
        for(int i=n-2;i>=0;i--){
            // i pointer will be at 2nd last element, j pointer will be at last element at start of loop
            int j = i+1;

        while(j<n && temperatures[j]<=temperatures[i]){
            if(result[j]==0){
                j=n;
            }else{
                j+=result[j];
            }
        }
        if(j<n){
            result[i]=j-i;
        }
        }
        return result;
    }
}