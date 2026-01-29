public static long minTime(List<Integer> files, int numCores, int limit) {
    List<Integer> parallel = new ArrayList<>();
    List<Integer> sequential = new ArrayList<>();

    for (int i = 0; i < files.size(); i++) {
        int filetime = files.get(i);

        if (filetime % numCores == 0) {
            parallel.add(filetime);
        } else {
            sequential.add(filetime);
        }
    }

    Collections.sort(parallel, Collections.reverseOrder());

    long totaltime = 0;   // FIXED: int -> long

    for (int i = 0; i < parallel.size(); i++) {
        int time = parallel.get(i);

        if (i < limit) {   // ✅ FIXED: i < time -> i < limit
            totaltime = totaltime + (time / numCores);
        } else {
            totaltime = totaltime + time;
        }
    }

    for (int i = 0; i < sequential.size(); i++) {
        int time = sequential.get(i);
        totaltime = totaltime + time;
    }

    return totaltime;
}
