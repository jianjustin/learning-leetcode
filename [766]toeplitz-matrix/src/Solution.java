public class Solution {

    public boolean isToeplitzMatrix(int[][] matrix) {
        boolean result = true;
        for (int i = 0; i < matrix.length; i++) {
            int m = i, n = 0;
            while (m < matrix.length && n < matrix[0].length){
                if(matrix[i][0] != matrix[m++][n++])
                    result = false;
            }
        }

        for (int i = 0; i < matrix[0].length; i++) {
            int m = i, n = 0;
            while (n < matrix.length && m < matrix[0].length){
                if(matrix[0][i] != matrix[n++][m++])
                    result = false;
            }
        }
        return result;
    }

}
