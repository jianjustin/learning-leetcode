public class Solution {

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++)
            dp[i] = min(dp[i-2],dp[i-1]) + cost[i];
        return min(dp[cost.length-1],dp[cost.length-2]);

    }

    public int min(int a , int b){
        if (a > b)
            return b;
        return a;
    }

}
