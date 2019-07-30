import java.util.Arrays;

public class Solution {

    public int[] fairCandySwap(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int[] result = new int[2];
        int sum_a = 0 , sum_b = 0 , swap_value = 0;

        for (int i = 0; i < A.length; i++)
            sum_a += A[i];
        for (int i = 0; i < B.length; i++)
            sum_b += B[i];

        swap_value = Math.abs(sum_a-sum_b)/2;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if(sum_a > sum_b && A[i] - B[j] == swap_value){
                    result[0] = A[i];
                    result[1] = B[j];
                }
                if(sum_a < sum_b && B[j] - A[i] == swap_value){
                    result[0] = A[i];
                    result[1] = B[j];
                }
            }
        }

        return result;
    }
}
