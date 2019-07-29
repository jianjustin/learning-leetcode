public class Solution {

    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] result = new int[queries.length];

        int value = 0;
        for (int j = 0; j < A.length; j++)
            if(A[j]%2==0)
                value += A[j];

        for (int i = 0; i < queries.length; i++) {
            int val = queries[i][0];
            int index = queries[i][1];
            if(A[index]%2==0)value -= A[index];
            A[index] += val;
            if(A[index]%2==0)value += A[index];
            result[i] = value;

        }
        return result;
    }

}
