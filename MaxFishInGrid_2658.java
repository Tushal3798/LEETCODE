public class MaxFishInGrid_2658 {

    private static final int[] dx = {-1, 1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};

    public static int maxFish(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int maxFish = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] > 0) {
                    int currentFish = dfs(grid, i, j);
                    maxFish = Math.max(maxFish, currentFish);
                }
            }
        }

        return maxFish;
    }

    private static int dfs(int[][] grid, int x, int y) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (x < 0 || x >= rows || y < 0 || y >= cols || grid[x][y] <= 0) {
            return 0;
        }

        int fish = grid[x][y];
        grid[x][y] = 0;

        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            fish += dfs(grid, newX, newY);
        }

        return fish;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 0, 0, 0},
            {0, 5, 0, 0},
            {0, 0, 3, 0},
            {0, 0, 0, 2}
        };

        int maxFish = maxFish(grid);
        System.out.println("Maximum number of fish: " + maxFish);
    }
}