class Solution {

    public int findCircleNum(int[][] isConnected) {
        // int start=1;
        ArrayList<ArrayList<Integer>> adjlist = new ArrayList<>();
        for (int i = 0; i < isConnected.length; i++) {
            adjlist.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected[i].length; j++) {
                if (isConnected[i][j] == 1) {
                    adjlist.get(i).add(j);
                    adjlist.get(j).add(i);
                }
            }
        }
        int count = 0;
        boolean[] visited = new boolean[isConnected.length];
        for (int i = 0; i < adjlist.size(); i++) {
            if (visited[i] == false) {
                count++;
                dfs(adjlist, i, visited);

            }
        }

        return count;

    }

    void dfs(ArrayList<ArrayList<Integer>> isConnected, int start, boolean[] visited) {

        visited[start] = true;
        for (int adj : isConnected.get(start)) {
            if (visited[adj] == false) {

                dfs(isConnected, adj, visited);

            }
        }

    }
}