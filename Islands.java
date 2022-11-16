public class Islands {
    private static int[][] grid = new int[][]{{1,1,0,0},{1,0,0,0},{0,0,1,0},{0,0,0,1}};
    
    public static void main(String[] args) {

        int n = numIslands(grid);
        System.out.println("no "+n);
    }

    private static int numIslands(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int num = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && grid[i][j] == 1){
                    dfs(grid, i, j, visited);
                    num++;
                }
            }
        }
        return num;
    }

    private static void dfs(int[][] grid, int row, int col, boolean[][] visited) {
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || visited[row][col] || grid[row][col] == 0)
        {
            return;
        }

        visited[row][col] = true;
        dfs(grid,row,col-1,visited);
        dfs(grid,row-1,col,visited);
        dfs(grid,row,col+1,visited);
        dfs(grid,row+1,col,visited);
        }
}
