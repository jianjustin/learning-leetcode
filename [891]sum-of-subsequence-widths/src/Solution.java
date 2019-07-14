import java.util.Arrays;

public class Solution {

    public int sumSubseqWidths(int[] A) {
        int mod = 1000000007;
        Arrays.sort(A);

        long ans = 0,pow2 = 1;
        for (int i = 0; i < A.length; i++,pow2 = (pow2<<1)%mod) {
            ans = (ans + (A[i] - A[A.length-1-i]) * pow2)%mod;
        }
        return (int)ans;
    }
}
