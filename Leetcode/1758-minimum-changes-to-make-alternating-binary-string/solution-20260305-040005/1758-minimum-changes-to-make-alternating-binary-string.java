class Solution {
    public int minOperations(String s) {
        int n = s.length();

        int startwith0 = 0;
        int startwith1 = 0;

        for(int i=0;i<n;i++){
            if(i%2==0){
                if(s.charAt(i)=='0'){
                    startwith1++;
                }else{
                    startwith0++;
                }
            } else {
                if(s.charAt(i) == '1'){
                    startwith1++;
                } else{
                    startwith0++;
                }
            }
        } 
        return Math.min(startwith0, startwith1);  
    }
}