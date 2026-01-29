public static List<Long> findSum(List<Integer> numbers, List<List<Integer>> queries) {

    int n = numbers.size();
    
    long[] prefixSum = new long[n + 1];
    int[] zeroCount = new int[n + 1];

    // Build prefix arrays
    for (int i = 0; i < n; i++) {
        prefixSum[i + 1] = prefixSum[i] + numbers.get(i);
        zeroCount[i + 1] = zeroCount[i] + (numbers.get(i) == 0 ? 1 : 0);
    }

    List<Long> result = new ArrayList<>();

    // Answer queries in O(1)
    for (List<Integer> q : queries) {
        int l = q.get(0);
        int r = q.get(1);
        int x = q.get(2);

        long rangeSum = prefixSum[r] - prefixSum[l - 1];
        int zeros = zeroCount[r] - zeroCount[l - 1];

        result.add(rangeSum + (long) zeros * x);
    }

    return result;
}