class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] merged = new int[nums1.length+nums2.length];

        for(int i=0;i<nums1.length;i++){
            merged[i] = nums1[i];
        }
        for(int i=nums1.length;i<merged.length;i++){
            merged[i] = nums2[i-nums1.length];

        }
        Arrays.sort(merged);

        double result = 0;
        if(merged.length%2==0){
            result = merged[merged.length/2] + merged[(merged.length/2)-1];
            result=result/2;
        }else{
            result=merged[merged.length/2];
        }
        return result;
    }
}