/**
 * 矩阵链乘法问题
 */
public class Solution {
    //矩阵
    class A{
        int i;
        int j;
    }
    public int MatrixChainOrder(A[] p){
        int len = p.length;
        int[][] m = new int[len][len] , s = new int[len][len];

        for (int i = 2; i <= len; i++) {//计算步长
            for (int j = 1; j < len-i+1; j++) {
                int k = i+j-1;
                for (int l = j; l < k; l++) {
                    int q = m[j][l] + m[l+1][k] + p[j].i*p[j].j*p[l].j + p[j].i*p[k].i*p[k].j;
                    if (0 == m[j][k])m[j][k] = q;
                    if (q < m[j][k])m[j][k] = q;
                }
            }
        }
        return m[0][len];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}
