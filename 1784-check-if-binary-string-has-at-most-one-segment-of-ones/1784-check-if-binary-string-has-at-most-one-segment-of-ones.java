class Solution {
    public boolean checkOnesSegment(String s) {
        int index =0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                if(i-index>1){
                    return false;
                }
                index=i;
            }
        }
        return true;
    }
}