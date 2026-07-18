class Solution {
    public int reverse(int x) {
        double answer =0;

        while(x!=0){
            double digit = x%10;
            answer = (answer * 10) +digit;
            if(answer >= Integer.MAX_VALUE || answer <= Integer.MIN_VALUE){
                return 0;
            } 
            x=x/10;
        }
        return (int)answer;
    }
}