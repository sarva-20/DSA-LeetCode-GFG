class Solution {

    // two multisets implemented via TreeMap
    private TreeMap<Integer, Integer> smallBasket = new TreeMap<>();
    private TreeMap<Integer, Integer> bigBasket = new TreeMap<>();

    private long leftsum = 0;
    private int m = 0;
    private int leftcount = 0;

    public long minimumCost(int[] nums, int k, int dist) {
        int n = nums.length;
        this.m = k - 1;

        for (int i = 1; i <= dist + 1; i++) {
            add(nums[i]);
        }
        rebalance();

        long mincost = nums[0] + leftsum;

        for (int i = 1; i < n - dist - 1; i++) {
            remove(nums[i]);
            add(nums[i + dist + 1]);
            rebalance();
            mincost = Math.min(mincost, nums[0] + leftsum);
        }
        return mincost;
    }

    private void add(int num) {
        smallBasket.put(num, smallBasket.getOrDefault(num, 0) + 1);
        leftcount++;
        leftsum += num;
    }

    private void remove(int num) {
        if (smallBasket.containsKey(num)) {
            removeFromSmall(num);
        } else {
            removeFromBig(num);
        }
    }

    private void rebalance() {
        while (leftcount > m) {
            int largest = smallBasket.lastKey();
            removeFromSmall(largest);
            addToBig(largest);
        }

        while (leftcount < m) {
            int smallest = bigBasket.firstKey();
            removeFromBig(smallest);
            addToSmall(smallest);
        }

        while (!smallBasket.isEmpty()
                && !bigBasket.isEmpty()
                && bigBasket.firstKey() < smallBasket.lastKey()) {

            int smallest = bigBasket.firstKey();
            int largest = smallBasket.lastKey();

            removeFromSmall(largest);
            removeFromBig(smallest);

            addToSmall(smallest);
            addToBig(largest);
        }
    }

    private void addToSmall(int num) {
        smallBasket.put(num, smallBasket.getOrDefault(num, 0) + 1);
        leftcount++;
        leftsum += num;
    }

    private void addToBig(int num) {
        bigBasket.put(num, bigBasket.getOrDefault(num, 0) + 1);
    }

    private void removeFromSmall(int num) {
        int val = smallBasket.get(num);
        if (val == 1) {
            smallBasket.remove(num);
        } else {
            smallBasket.put(num, val - 1);
        }
        leftcount--;
        leftsum -= num;
    }

    private void removeFromBig(int num) {
        int val = bigBasket.get(num);
        if (val == 1) {
            bigBasket.remove(num);
        } else {
            bigBasket.put(num, val - 1);
        }
    }
}
