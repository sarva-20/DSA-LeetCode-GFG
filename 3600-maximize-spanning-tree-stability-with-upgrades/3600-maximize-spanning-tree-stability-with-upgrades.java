/**
variant of Kruskal minimum spanning tree algorithm
 */
class Solution {
    public int maxStability(int n, int[][] edges, int k) {
        if (edges.length < n - 1) {
            return -1;
        }
        
        // initially mark everything as wanted.
        boolean[] wantedEdges = new boolean[edges.length];
        Arrays.fill(wantedEdges, true);

        // sort the edges in such a way that mandatory edges come first 
        // and in optional, they are sorted in decreasing order by strength.
        Arrays.sort(edges, (a, b) -> {
            // 1) If one edge has flag=1 and the other flag=0, put the 1-flag first
            if (a[3] == 1 && b[3] == 0)
                return -1;
            if (a[3] == 0 && b[3] == 1)
                return 1;
            // 2) Otherwise, both flags are equal, so sort by strength descending
            return Integer.compare(b[2], a[2]);
        });

        boolean[] nodesVisited = new boolean[n];
        // build the spanning tree according to problem 
        // specifications
        filterEdges(edges, n, wantedEdges, nodesVisited);

        // see if any nodes are disconnected
        for (int i = 0; i < n; i++) {
            if (!nodesVisited[i]) {
                System.out.println("All nodes not present in spanning tree");
                return -1;
            }
        }
        // build the graph and check whether there is a cycle with 
        // dfs.
        List<Pair<Integer,Boolean>> tree = new ArrayList<>();
        List<List<Integer>> graph = buildAdjList(edges, wantedEdges, n, tree);
        boolean[] visited = new boolean[n];
        if (checkCycle(0, graph, visited, -1)) {
            System.out.println("Contains cycle");
            return -1;
        }

        // sorting the edges in increasing order of strength and doubling 
        // the first k edges(optional) before returning the smallest one.
        int index = 0;
        int doubledCnt = 0;
        Collections.sort(tree, (a, b) -> (Integer.compare(a.getKey(), b.getKey())));
        int minAns = Integer.MAX_VALUE;
        while (index < tree.size()) {
            int strength = tree.get(index).getKey();
            if (!tree.get(index).getValue() && doubledCnt < k) {
                minAns = Math.min(minAns, 2*strength);
                doubledCnt++;
            } else {
                minAns = Math.min(minAns, strength);
            }
            index++;
        }
        return minAns;

    }

    List<List<Integer>> buildAdjList(int[][] edges, boolean[] wantedEdges, int n, List<Pair<Integer,Boolean>> tree) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            if (!wantedEdges[i]) {
                continue;
            }
            int[] edge = edges[i];
            int a = edge[0];
            int b = edge[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
            tree.add(new Pair<>(edge[2], edge[3] == 1 ? true : false));
        }
        return graph;
    }

    void filterEdges(int[][] edges, int n, boolean[] wantedEdges, boolean[] visited) {
        int[] roots = new int[n];
        for(int i=0;i<n;i++)
            roots[i] = i;
        int[] ranks = new int[n];
        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            // if edge is optional and both nodes are already connected
            if (edge[3] == 0 && find(edge[0], roots) == find(edge[1], roots)) {
                wantedEdges[i] = false;
            } else {
                // otherwise add edge
                union(edge[0], edge[1], roots, ranks);
            }
            visited[edge[0]] = true;
            visited[edge[1]] = true;
        }
    }

    int find(int a, int[] roots) {
        if(roots[a] == a)
            return a;
        roots[a] = find(roots[a], roots);
        return roots[a];
    }

    void union(int a, int b, int[] roots, int[] ranks) {
        int roota = find(a, roots);
        int rootb = find(b, roots);
        if(roota != rootb) {
            if(ranks[roota] > ranks[rootb]) {
                roots[rootb] = roota;
            } else if(ranks[rootb] > ranks[rootb]) {
                roots[roota] = rootb;
            } else {
                roots[rootb] = roota;
                ranks[roota]++;
            }
        }
    }

    boolean checkCycle(int node, List<List<Integer>> graph, boolean[] visited, int parent) {
        if (visited[node])
            return true;
        visited[node] = true;
        for (int adj : graph.get(node)) {
            if (adj == parent) {
                continue;
            }
            if (checkCycle(adj, graph, visited, node))
                return true;
        }
        return false;
    }
}