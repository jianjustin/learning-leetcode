import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> letterCasePermutation(String S) {
        List<String> result = new ArrayList<String>();
        if (null == S || S.length() == 0)return result;
        letterCasePermutation1(result,0,S.toCharArray());
        return result;
    }

    public void letterCasePermutation1(List<String> list , int k , char[] S) {
        while (k < S.length && !Character.isLetter(S[k]))k++;
        if (k >= S.length){
            list.add(new String(S));
            return;
        }
        letterCasePermutation1(list,k+1,S);
        S[k] = toLowerOrUpperChar(S[k]);
        letterCasePermutation1(list,k+1,S);
    }

    public char toLowerOrUpperChar(char c){
        if (c >= 65 && c <= 90)return Character.toLowerCase(c);
        if (c >= 97 && c <= 122)return Character.toUpperCase(c);
        return c;
    }

}
