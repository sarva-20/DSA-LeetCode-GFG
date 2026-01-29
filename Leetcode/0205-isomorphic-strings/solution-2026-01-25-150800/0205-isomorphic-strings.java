class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        for(int i=0;i<s.length();i++){

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(!(mapS.containsKey(ch1))){
                mapS.put(ch1,i);
            }

            if(!(mapT.containsKey(ch2))){
                mapT.put(ch2,i);
            }

            if(mapS.get(ch1) != mapT.get(ch2)){
                return false;
            }
        }
        return true;
    }
}