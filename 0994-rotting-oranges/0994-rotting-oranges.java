class Solution {
    public int orangesRotting(int[][] grid) {
        int min = 2;
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    spread(grid, i, j, 2);
                }
            }
        }
        
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
                
                min = Math.max(min, grid[i][j]);
            }
        }
        
        return min -2;
    }
    
    private void spread(int[][] grid, int i, int j, int count) {
        if (i < 0 || j < 0 || i >= grid.length || j >=grid[0].length || grid[i][j] > 1 && grid[i][j] < count || grid[i][j] == 0) {
            return;
        }
        
        grid[i][j] = count;
        
        spread(grid, i +1, j, count +1);
        spread(grid, i, j +1, count +1);
        spread(grid, i -1, j, count +1);
        spread(grid, i, j -1, count +1);
    }
}