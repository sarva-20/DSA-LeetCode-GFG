class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0){
            return false;
        }

        int temp=x;
        int sum=0;

        while(temp!=0){
            int remainder = temp%10;
            sum = sum*10 + remainder;
            temp = temp/10;

        }
        if(sum==x){
            return true;
        }
        else{
            return false;
        }
    }
}