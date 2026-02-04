class Solution {
    public long maxSumTrionic(int[] nums) {
        int n = nums.length;
        long sum = Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            int j = i+1;
            long res = 0;
            while(j<n && nums[j-1] < nums[j]){
                j++;
            }
            int p = j-1;
            if(p==i) continue;
            res+=nums[p] + nums[p-1];
            while(j<n && nums[j-1]>nums[j]){
                res+=nums[j];
                j++;
            }
            int q = j-1;
            if(q==p || q== n-1 ||  (j < n && nums[j] <= nums[q])){
                i=q;
                continue;
            }
            res+=nums[q+1];

            long cur = 0 , max = 0;
            for(int k=p-2;k>=i;k--){
                cur+=nums[k];
                max = Math.max(max , cur);
            }
            res+=max;
            cur = 0 ;
            max = 0;
            for(int k=q+2;k<n && nums[k]>nums[k-1];k++){
                cur+=nums[k];
                max = Math.max(max , cur);
            }
            res+=max;
            sum = Math.max(sum , res);
            i = q - 1;
        }
        if(sum == Long.MIN_VALUE) return 0;
        return sum;
    }
}