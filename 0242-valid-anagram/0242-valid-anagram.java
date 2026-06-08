class Solution {
    public boolean isAnagram(String s, String t) {

        // Storage for string to number conv
        int[] countS = new int[26];
        int[] countT = new int[26];

        // Converts character to index
        for(int i=0;i<s.length();i++){
            char cS = s.charAt(i);
            countS[cS-'a']++;
        }

        for(int i=0;i<t.length();i++){
            char cT = t.charAt(i);
            countT[cT-'a']++;
        }

        // To compare frequency of the characters
        for(int i=0;i<26;i++){
            if(countS[i]!=countT[i]){
                return false;
            }
        }
        return true;

    }
}