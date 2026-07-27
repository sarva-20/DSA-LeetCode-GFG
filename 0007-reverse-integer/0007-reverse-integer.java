class Solution {
    public int reverse(int x) {
        double answer =0;

        // Until a number is not zero
        while(x!=0){

            //Extract the digit's place number
            double digit = x%10;

            // 
            // e.g. x=123, answer=0 -> answer=(0*10)+3=3
            // then answer = 3 -> answer = (3*10)+2 = 30+2=32
            // then answr = 32 -> answer = (32*10)+1 = 320+1=321
            answer = (answer * 10) +digit;

            // If answer goes in -ve or very large number
            if(answer >= Integer.MAX_VALUE || answer <= Integer.MIN_VALUE){
                return 0;
            } 

            //Divides x by 10.
            // E.g. 123/10 = 12
            // 12/10 = 1
            x=x/10;
        }
        return (int)answer;
    }
}