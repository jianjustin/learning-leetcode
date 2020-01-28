import java.util.ArrayList;
import java.util.List;

public class Solution {

    public String convert(String s, int numRows) {
        if (null == s || s.length() == 0 || 1 == numRows)return s;
        int a = 0;//计算有多少列
        String[] arr = new String[numRows];
        boolean godown = true;//判断方向

        for (int i = 0; i < s.length(); i++) {
            if (null == arr[a])arr[a] = "";
            arr[a] += s.charAt(i);
            if (godown)
                a++;
            else
                a--;
            if (a == numRows){
                godown = !godown;
                a -= 2;
            }
            if (0 == a)godown = !godown;

        }

        String result = "";
        for (int i = 0; i < numRows; i++)
                result += arr[i];

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "ABCD";
        String s1 = solution.convert(s,2);
        System.out.println(s1);
    }

}
