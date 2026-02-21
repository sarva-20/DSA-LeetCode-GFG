class Solution {
    public int countPrimeSetBits(int left, int right) {
        List<Integer> primes = Arrays.asList(2,3,5,7,11,13,17,19);

        int result=0;

        for(int i=left;i<=right;i++){
            int bits=countbits(i);
            if (primes.contains(bits)){
                result++;
            }
        }
        return result;
    }
    public int countbits(int n){
        int count=0;
        while(n>0){
            if((n&1)==1) count++;
            n=n>>1;
        }
        return count;
    }
}