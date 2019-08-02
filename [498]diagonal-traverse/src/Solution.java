public class Solution {

    public int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length;
        if(m == 0) return new int[0];
        int n = matrix[0].length, flag = 0;
        int[] ans = new int[m * n];
        for(int i = 0; i <= m + n; i++){
            if(i % 2 == 0)
                for(int j = m-1; j >= 0; j--){
                    if( i - j >= 0 && i - j < n)
                        ans[flag++] = matrix[j][i - j];
                }
            else
                for(int j = 0; j < m; j++){
                    if(  i - j >= 0 && i - j < n)
                        ans[flag++] = matrix[j][i - j];
                }
        }
        return ans;
    }
}
