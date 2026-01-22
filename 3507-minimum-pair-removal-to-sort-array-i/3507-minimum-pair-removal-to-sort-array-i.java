class Solution {
    public int minimumPairRemoval(int[] nums) {
        int ans = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        //set remove

        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }

        while(!is_sorted(list)){
            int minsum=list.get(0)+list.get(1);
            int minindex =0;
            for(int i=0;i<list.size()-1;i++){
                if(list.get(i) + list.get(i+1) < minsum){
                    minsum=list.get(i) + list.get(i+1);
                    minindex =i;

                }
            }
            mergefun(list,minindex);
            ans++;
        }
        return ans;

    }

    public static void mergefun(ArrayList<Integer> list , int index){
        int start = list.get(index);
        int next = list.get(index+1);

        int sum = start + next;

        list.remove(index+1);
        list.set(index,sum);
    }

    public boolean is_sorted(ArrayList<Integer> list ){
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i) > list.get(i+1)){
                return false;
            }
        }
        return true;
    }

}