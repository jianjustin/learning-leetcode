public class Solution {

    public int findLength(int[] A, int[] B) {
        int max =0,length = A.length + 1;
        int[] dp = new int[length];
        for (int i = 0; i < A.length ; i++) {
            for (int j = B.length-1; j >= 0; j--) {
                dp[j + 1] = A[i] == B[j] ? dp[j]+1 : 0;
                max =Math.max(max,dp[j+1]);
            }
        }
        return max;
    }
}
