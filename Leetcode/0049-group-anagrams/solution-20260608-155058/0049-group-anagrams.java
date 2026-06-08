class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // Groups strings in hashmap
        HashMap<String, List<String>> map = new HashMap<>();

        // Looping thru string and converting to character
        for(int i=0;i<strs.length;i++){
            char[] ch = strs[i].toCharArray();
            // Now the string is converted to character, which can be sorted

            Arrays.sort(ch);

            // Convert sorted character to string

            String str = new String(ch);

            // If the string converted is not present in group, create a new group in hashmap to store it

            if(!map.containsKey(str)){
                map.put(str, new ArrayList<>());
            }

            // Now we have groups of strings which are sorted

            // Add original string to sorted group
            map.get(str).add(strs[i]);
        }
        return new ArrayList<>(map.values());
        


    }
}