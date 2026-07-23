class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int[] result = new int[n+1];

        for(int i=n-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
            }else{
                digits[i]++;
                return digits;
            }
        }
        result[0]=1;
        return result;
    }
}