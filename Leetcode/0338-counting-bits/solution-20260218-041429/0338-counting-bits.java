class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];

        for(int i=0;i<n+1;i++){
            result[i]=countbit(i);
        }
        return result;
    }
    public static int countbit(int n){
        int count=0;
        while(n>0){
            if((n&1)==1) count++;
            n = n>>1;
        }
        return count;
    }
}