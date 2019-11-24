/**
 * 最长公共子序列
 */
public class Solution {

    public int lcsLength(String x , String y){
        int m = x.length() , n = y.length();
        int[][] b = new int[m+1][n+1] , c = new int[m+1][n+1];

        for (int i = 1; i <= m ; i++) {
            for (int j = 1; j <= n ; j++) {
                if (x.charAt(i-1) == y.charAt(j-1))
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
        System.out.println(solution.lcsLength(x,y));
    }
}
