class Solution {
public int hammingWeight(int num) {
        int count=0;

        while(num>0){
            if((num&1)==1){
                count++;
            }
            num=num>>1;
        }
        return count;
    }
}