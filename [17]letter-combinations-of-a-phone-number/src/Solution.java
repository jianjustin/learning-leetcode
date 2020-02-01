import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
        char[][] arr = {{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};

        List<String> result = new ArrayList<>() , result1 = new ArrayList<>();
        if (null == digits || digits.length() == 0)return result;
        char[] digits1 = digits.toCharArray();

        for (int i = 0; i < digits1.length; i++) {
            char[] item = arr[digits1[i]-50];//获取对应子集
            for (int j = 0; j < item.length; j++) {
                if (0 == i)
                    result.add("" + item[j]);
                else if (i % 2 == 0)
                    for (int k = 0; k < result1.size(); k++)
                        result.add(result1.get(k) + item[j]);
                else
                    for (int k = 0; k < result.size(); k++)
                        result1.add(result.get(k) + item[j]);
            }
            if (i % 2 == 0)result1.clear();
            if (i % 2 != 0)result.clear();
        }

        if (digits1.length%2 != 0)return result;
        return result1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> result = solution.letterCombinations("23");

        for (int i = 0; i < result.size(); i++) {
            System.out.print("  "+result.get(i));
        }
    }


}
