public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        dp[0][0] = 1;
        if (1 == obstacleGrid[0][0])dp[0][0] = 0;

        for (int i = 0; i < obstacleGrid[0].length; i++) {
            for (int j = 0; j < obstacleGrid.length; j++) {
                if (1 == obstacleGrid[j][i])
                    continue;
                if (i > 0)
                    dp[j][i] += dp[j][i-1];
                if (j > 0)
                    dp[j][i] += dp[j-1][i];
            }
        }
        return dp[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}
