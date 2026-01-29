public static long getMinCost(List<Integer> crew_id, List<Integer> job_id) {

    // Step 1: Sort both lists
    Collections.sort(crew_id);
    Collections.sort(job_id);

    long totalCost = 0;

    // Step 2: Pair and calculate cost
    for (int i = 0; i < crew_id.size(); i++) {
        int crew = crew_id.get(i);
        int job = job_id.get(i);

        int cost = Math.abs(crew - job);
        totalCost = totalCost + cost;
    }

    return totalCost;
}
