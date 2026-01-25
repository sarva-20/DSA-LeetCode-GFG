class Solution {
    public boolean isPalindrome(String s) {
        
        int left=0;
        int right=s.length()-1;

        s = s.toLowerCase();

        while(left<right){
            char c = s.charAt(left);
            if(!((c>='a' && c<='z') || (c>='0' && c<='9'))){
                left++;
                continue;
            }
            char cb = s.charAt(right);
            if(!((cb>='a' && cb<='z') || (cb>='0' && cb<='9'))){
                right--;
                continue;
            }

            if(c != cb){
                return false;
                
            }
            left++;
            right--;
        }
        return true;
       
    }
}