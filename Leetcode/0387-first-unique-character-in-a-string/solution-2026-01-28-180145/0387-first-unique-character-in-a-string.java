class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> set = new HashMap<>();
        int index = -1;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if (set.containsKey(c)) {
                set.put(c, set.get(c) + 1);
                } else {
                    set.put(c, 1);
                }
            }

        for(int i=0;i<s.length();i++){
            if(set.get(s.charAt(i))==1){
                index = i;
                break;
            }
        }
        return index;
    }
}