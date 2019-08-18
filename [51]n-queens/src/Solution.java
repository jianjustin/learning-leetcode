import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>>  result = new ArrayList<List<String>>();
        char[][] queens = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                queens[i][j] = '0';
        solveNQueens1(result,0,queens);
        return result;
    }

    public void solveNQueens1(List<List<String>> list , int k , char[][] queens){
        int sum = queens.length;
        char[] items1 = new char[sum] , items2 = new char[sum];
        for (int i = 0; i < sum; i++) {
            items1[i] = '*';
            items2[i] = queens[k][i];
        }
        for (int i = 0; i < sum; i++) {
            if ('0' != items2[i])continue;
            items1[i]  = 'Q';
            queens[k] = items1;
            //设置限制点
            queens = noQueen(queens,k,i);
            if (k+1 < sum)
                solveNQueens1(list,k+1,queens);
            else
                list.add(toCharList(queens));
            items1[i] = '*';
        }
    }

    public char[][] noQueen(char[][] chars , int i , int j){
        int temp = i;
        while (i+1 < chars.length){
            chars[++i][j] = '*';
            if (j-i+temp > 0 && j-i+temp < chars.length)chars[i][j-i+temp] = '*';
            if (j+i-temp > 0 && j+i-temp < chars.length)chars[i][j+i-temp] = '*';
        }
        return chars;
    }

    public List<String> toCharList(char[][] chars){
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < chars.length; i++) {
            list.add(new String(chars[i]));
        }
        return list;
    }
}
