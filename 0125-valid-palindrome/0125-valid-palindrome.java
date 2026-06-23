class Solution {
    public boolean isPalindrome(String s) {
        
        // Initialize two pointers
        // Left at start, right at last 
        int left=0;
        int right=s.length()-1;

        s = s.toLowerCase();

        // A single while to check from front and back
        // char c checks from front i.e. from left
        // char cB checks from last i.e. from right

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

            // if pointer from left is not equal to the pointer from right, both char are not equal, so not palindrome

            if(c != cb){
                return false;
                
            }

            // if both char at pointers are equal, move pointer 
            left++;
            right--;
        }

        // if all values are equal, and false doesn't occur until left<right. then palindrome
        return true;
       
    }
}