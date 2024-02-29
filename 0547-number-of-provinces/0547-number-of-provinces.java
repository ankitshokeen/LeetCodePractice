class Solution {
    public int findCircleNum(int[][] m) {
        int n = m.length;
        boolean[] visited = new boolean[n];
        int count = 0;
        
        for (int i=0; i<n; i++) {
            if (!visited[i]) {
                count++;
                dfs(m, i, visited);
            }
        }
        return count;
    }
    
    private void dfs(int[][] m, int i, boolean[] visited) {
        for (int j=0; j<m[i].length; j++) {
            if (m[i][j] != 0 && visited[j] == false) {
                visited[j] = true;
                dfs(m, j, visited);
            }
        }
    }
    
}