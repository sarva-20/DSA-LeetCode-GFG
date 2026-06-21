class Solution {
    public int getSum(int a, int b) {
        
        // Running loop until carry is 0, here carry is at b
        while(b!=0){

            // Store the original number left-shifted by 1 
            int temp = (a & b)<<1;

            // Directly XOR - add two decimals
            a = a^b;
            b=temp;
        }
        return a;
    }
}
