class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        for(int i=0;i+9<s.length();i++){
            if(!seen.add(s.substring(i,i+10))){
                repeated.add(s.substring(i,i+10));

            }
        }
        return new ArrayList<>(repeated);
    }
}