public class Solution {

    public int[] sortedSquares(int[] A) {
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            B[i] = (int)Math.pow(A[i],2);
        }

        int[] C = new int[A.length];
        for (int i = 0; i < B.length; i++) {
            int min = -2,min_item = 0;
            for (int j = 0; j < B.length; j++) {
                if(B[j] == -1)continue;
                if(min == -2 || B[j] < min){
                    min = B[j];
                    min_item = j;
                }

            }
            C[i] = min;
            B[min_item] = -1;

        }


        return C;
    }
}
