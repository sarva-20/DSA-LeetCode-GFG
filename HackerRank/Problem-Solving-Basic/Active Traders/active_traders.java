Map<String, Integer> tm = new TreeMap<>();

for (String name : names) {
	tm.put(name, tm.getOrDefault(name, 0) + 1);
}

for (Map.Entry<String, Integer> entry : tm.entrySet()) {
	int fivePercent = (int) Math.ceil(0.05 * n);

	if (entry.getValue() >= 5 && entry.getValue() >= fivePercent) {
		System.out.println(entry.getKey());
	}
}