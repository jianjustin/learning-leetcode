public class Solution {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int x = nums.length , y = nums[0].length;
        if(x*y < r*c)return nums;

        int[][] result = new int[r][c];

        int m = 0 , n = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                result[m][n++] = nums[i][j];
                if (n == c){
                    m++;
                    n = 0;
                }
            }
        }
        return result;
    }

}
