/**
 * 最长公共子序列
 */
public class Solution {

    public int longestCommonSubsequence(String text1, String text2){
        int m = text1.length() , n = text2.length();
        char[] x1 = text1.toCharArray() , y1 = text2.toCharArray();
        int[][] b = new int[m+1][n+1] , c = new int[m+1][n+1];

        for (int i = 1; i <= m ; i++) {
            for (int j = 1; j <= n ; j++) {
                if (x1[i-1] == y1[j-1])
                    c[i][j] = c[i-1][j-1] + 1;
                else if (c[i-1][j] >= c[i][j-1])
                    c[i][j] = c[i-1][j];
                else
                    c[i][j] = c[i][j-1];
            }
        }
        return c[m][n];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String x = "ABCBDAB" , y = "BDCABA";
        System.out.println(solution.longestCommonSubsequence(x,y));
    }
}
