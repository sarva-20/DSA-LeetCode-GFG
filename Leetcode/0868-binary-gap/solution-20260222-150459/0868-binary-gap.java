class Solution {
    public int binaryGap(int n) {
        int current=0;
        int prev=-1;

        int result=0;

        while(n>0){
            if((n&1)>0){
                result = (prev!=-1) ? Math.max(result, current-prev) : result;
                prev=current;
            }

            current++;
            n=n>>1;

        }
        return result;
    }
}