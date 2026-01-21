class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        List<String> result = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for(int i=0;i+9<s.length();i++){
            if(set.contains(s.substring(i,i+10)) && !result.contains(s.substring(i,i+10))){
                result.add(s.substring(i,i+10));
            } else{
                set.add(s.substring(i,i+10));
            }
        }
        return result;
    }
}