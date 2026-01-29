class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] countA = new int[26];
        int[] countB =  new int[26];

        for(int i=0;i<s.length();i++){
            char cA = s.charAt(i);
            countA[cA - 'a']++;
            
        }

        for(int i=0;i<t.length();i++){
            char cB = t.charAt(i);
            countB[cB - 'a']++;
            
        }

        for(int i=0;i<26;i++){
            if(countA[i] != countB[i]){
                return false;
            }
        }
        return true;

    }
}