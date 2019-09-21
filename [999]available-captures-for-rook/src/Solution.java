public class Solution {
    public int numRookCaptures(char[][] board) {
        int ans = 0 , i = -1 , j = -1;

        //寻找车的位置
        for (int m = 0; m < board.length; m++) {
            for (int n = 0; n < board[m].length; n++) {
                if ('R' == board[m][n]){
                    i = m;
                    j = n;
                }
            }
        }

        for (int k = j - 1; k >= 0; k--) {
            if (board[i][k] == 'B') break;
            if (board[i][k] == 'p') {
                ans++;
                break;
            };
        };

        for (int k = j + 1; k < 8; k++) {
            if (board[i][k] == 'B') break;
            if (board[i][k] == 'p') {
                ans++;
                break;
            };
        };

        for (int k = i - 1; k >= 0; k--) {
            //if (board[k][j] == '.') continue;
            if (board[k][j] == 'B') break;
            if (board[k][j] == 'p') {
                ans++;
                break;
            };
        };

        for (int k = i + 1; k < 8; k++) {
            if (board[k][j] == 'B') break;
            if (board[k][j] == 'p') {
                ans++;
                break;
            };
        };

        return ans;
    }
}
