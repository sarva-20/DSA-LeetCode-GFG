class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Method 2 : Using Hashset to remove dupes and check the size
        HashSet<Integer> seen = new HashSet<>();

        for(int num : nums){
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}