public class Solution {
    public int[] countBits(int num) {
        int[] dp = new int[num+1];
        dp[0] = 0;
        if (0 == num)return dp;
        dp[1] = 1;
        for (int i = 2; i <= num; i++)
           dp[i] = (i%2 == 0 ? dp[i/2] : (dp[i-1]+1));
        return dp;
    }
}
