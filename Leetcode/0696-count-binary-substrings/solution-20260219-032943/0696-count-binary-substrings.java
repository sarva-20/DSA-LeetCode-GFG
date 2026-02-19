class Solution {
    public int countBinarySubstrings(String s) {
        int result =0;

        int prev=0;
        int current =1;

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                current++;
            }else{
                result+=Math.min(prev,current);
                prev=current;
                current=1;
            }
        }
        return result + Math.min(prev,current);

    }
}