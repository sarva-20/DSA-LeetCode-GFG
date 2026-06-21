class Solution {
    public int getSum(int a, int b) {
        
        // Running loop until no carry is left
        while(b!=0){

            // Store the original number left-shifted by 1 
            // Finds only the carry and moves it left
            int temp = (a & b)<<1;

            // Directly XOR - add two decimals
            // Adds A and B ignores the carry
            a = a^b;
            b=temp;
        }
        return a;
    }
}
