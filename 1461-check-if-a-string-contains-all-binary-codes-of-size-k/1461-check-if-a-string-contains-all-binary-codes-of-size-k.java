class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> set = new HashSet<>();

        int unique = 1<<k;

        for(int i=k;i<=s.length();i++){
            String substr = s.substring(i-k,i);

            if(!set.contains(substr)){
                set.add(substr);
                unique--;
            }

            if(unique==0){
                return true;

            }
        }
        return false;
    }
}