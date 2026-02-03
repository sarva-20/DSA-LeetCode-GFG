import java.util.*;

class Solution {

    private TreeMap<Integer, Integer> smallBasket = new TreeMap<>();
    private TreeMap<Integer, Integer> bigBasket = new TreeMap<>();

    private int m = 0;
    private int leftcount = 0;
    private int lwindow = 0;
    private int rwindow = 0;

    private long leftsum = 0; // needed for helper methods

    public double[] medianSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        this.m = k;

        double[] result = new double[n - k + 1];

        if (k % 2 == 0) {
            this.lwindow = k / 2;
            this.rwindow = k / 2;
        } else {
            this.rwindow = k / 2;
            this.lwindow = k - rwindow;
        }

        for (int i = 0; i < k; i++) {
            add(nums[i]);
        }
        rebalance();

        // first window
        result[0] = (k % 2 == 0)
                ? ((double) smallBasket.lastKey() + bigBasket.firstKey()) / 2.0
                : (double) smallBasket.lastKey();

        for (int i = 1; i <= n - k; i++) {
            remove(nums[i - 1]);
            add(nums[i + k - 1]);
            rebalance();

            result[i] = (k % 2 == 0)
                    ? ((double) smallBasket.lastKey() + bigBasket.firstKey()) / 2.0
                    : (double) smallBasket.lastKey();
        }

        return result;
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

    // --------------------------------- //

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

    private void rebalance() {
        while (leftcount > lwindow) {
            int largest = smallBasket.lastKey();
            removeFromSmall(largest);
            addToBig(largest);
        }

        while (leftcount < lwindow) {
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
}
