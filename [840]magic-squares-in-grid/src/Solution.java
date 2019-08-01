public class Solution {

    public int numMagicSquaresInside(int[][] grid) {
        int result = 0;
        int[][] nums = new int[3][3];
        for (int i = 0; i < grid.length-2; i++) {
            for (int j = 0; j < grid[i].length-2; j++) {
                if(isMagicSquares(i,j,grid))
                    result++;
            }
        }
        return result;
    }

    public boolean isMagicSquares(int i , int j , int[][] grid){
        boolean result = false;
        if(grid[i+1][j+1]!=5)return false;
        result = (grid[i][j] + grid[i+1][j+1] + grid[i+2][j+2]) == 15;
        result = (grid[i+2][j] + grid[i+1][j+1] + grid[i][j+2]) == 15;
        for (int m = 0; m < 3; m++) {
            if((m != 1)&&(isNotNum(grid[i+m][j])||isNotNum(grid[i+m][j+1])||isNotNum(grid[i+m][j+2])))
                return false;
            if((m == 1)&&(isNotNum(grid[i+m][j])||isNotNum(grid[i+m][j+2])))
                return false;
            int value = grid[i+m][j]+grid[i+m][j+1]+grid[i+m][j+2];
            if (15 != value)result = false;
        }
        for (int m = 0; m < 3; m++) {
            if((m != 1)&&(isNotNum(grid[i][j+m])||isNotNum(grid[i+1][j+m])||isNotNum(grid[i+2][j+m])))
                return false;
            if((m == 1)&&(isNotNum(grid[i][j+m])||isNotNum(grid[i+2][j+m])))
                return false;
            int value = grid[i][j+m]+grid[i+1][j+m]+grid[i+2][j+m];
            if (15 != value)result = false;
        }
        return result;
    }

    public boolean isNotNum(int item){
        if(item >= 10 || item <= 0 || item==5)return true;
        return false;
    }
}
