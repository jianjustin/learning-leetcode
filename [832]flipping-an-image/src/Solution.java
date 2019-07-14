public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] B = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                B[i][A[i].length-1-j] = A[i][j];
                if(0 == B[i][A[i].length-1-j])
                    B[i][A[i].length-1-j] = 1;
                else
                    B[i][A[i].length-1-j] = 0;
            }
        }

        return B;
    }
}
