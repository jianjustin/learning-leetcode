public class Solution {

    public int[] sortArrayByParityII(int[] A) {
        int[] B = new int[A.length];

        int m = 0,n = 1;
        for (int i = 0; i < A.length; i++) {
            if(A[i]%2 == 0) {
                B[m] = A[i];
                m+=2;
            }else {
                B[n] = A[i];
                n+=2;
            }
        }

        return B;
    }
}
