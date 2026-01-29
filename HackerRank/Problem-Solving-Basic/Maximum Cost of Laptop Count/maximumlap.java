public static int maxCost(List<Integer> cost, List<String> labels, int dailyCount) {

    int currentCost = 0;
    int currentLegal = 0;
    int maxCost = 0;

    for (int i = 0; i < cost.size(); i++) {

        // Add cost for every laptop
        currentCost = currentCost + cost.get(i);

        // Count only legal laptops
        if (labels.get(i).equals("legal")) {
            currentLegal++;
        }

        // If daily legal target is reached
        if (currentLegal == dailyCount) {

            // Update maximum cost
            if (currentCost > maxCost) {
                maxCost = currentCost;
            }

            // Reset for next day
            currentCost = 0;
            currentLegal = 0;
        }
    }

    return maxCost;
}
