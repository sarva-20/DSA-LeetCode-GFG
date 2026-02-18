class Solution {
    public boolean hasAlternatingBits(int n) {
        int prev = -1;
        for(;n>0;n=n>>1){
            int temp = n&1;
            if(temp==prev){
                return false;
            }
            prev=temp;
            
        }
        return true;
    }
}