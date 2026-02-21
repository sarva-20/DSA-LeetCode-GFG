class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> allowedset = new HashSet<>();

        for(char ch : allowed.toCharArray()){
            allowedset.add(ch);
        }

        int count=0;

        for(String word : words){
            boolean allowedchar = true;

            for(char ch : word.toCharArray()){
                if(!allowedset.contains(ch)){
                    allowedchar = false;
                    break;
                }
            }

            if(allowedchar){
                count++;
            }
        }
        return count;
    }
}