public class Solution {
    public int countSubstrings(String s) {
        int len = s.length();
        int[][] dp = new int[len][len];
        for (int i = 0; i < len; i++)
            dp[i][i] = 1;

        for (int l = 1; l <= len; l++) {//设置步长
            for (int i = 0; i+l < len; i++) {//字串起始位置
                int j = l + i;//字串结束位置
                if (iscountSubstrings(s.substring(i,j+1)))
                    dp[i][j] = dp[i+1][j] + dp[i][j-1] - dp[i+1][j-1] + 1;
                else
                    dp[i][j] = dp[i+1][j] + dp[i][j-1] - dp[i+1][j-1];
            }
        }
        return dp[0][len-1];
    }

    public boolean iscountSubstrings(String s){
        char[] c = s.toCharArray();
        int i = 0 , j = s.length()-1;
        while (i < j){
            if (c[i] != c[j])return false;
            i++;
            j--;
        }
        return true;
    }
}
